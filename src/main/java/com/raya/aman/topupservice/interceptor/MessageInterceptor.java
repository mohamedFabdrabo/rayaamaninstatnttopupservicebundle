package com.raya.aman.topupservice.interceptor;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.io.IOUtils;
import org.apache.cxf.binding.soap.interceptor.SoapPreProtocolOutInterceptor;
import org.apache.cxf.io.CachedOutputStream;
import org.apache.cxf.message.Exchange;
import org.apache.cxf.message.Message;
import org.apache.cxf.phase.AbstractPhaseInterceptor;
import org.apache.cxf.phase.Phase;

import com.raya.aman.logger.AmanLogger;
import com.raya.aman.util.configuration.PropertyInit;

public class MessageInterceptor extends AbstractPhaseInterceptor {
	final Pattern pattern = Pattern.compile("<TermID>(.+?)</TermID>",
			Pattern.DOTALL);

	public MessageInterceptor() {
		super(Phase.PRE_STREAM);
		addBefore(SoapPreProtocolOutInterceptor.class.getName());
	}

	public void handleMessage(Message message) {
		boolean isOutbound = false;
		isOutbound = message == message.getExchange().getOutMessage()
				|| message == message.getExchange().getOutFaultMessage();

		if (isOutbound) {
			OutputStream os = message.getContent(OutputStream.class);
			// HolderInInterceptor holderInInterceptor= new
			// HolderInInterceptor();
			// message.put(Message.REQUESTOR_ROLE,true);
			// Holder[] obj=new Holder[4];
			// obj[2]=new Holder<ResponseHeaderType>(new ResponseHeaderType()) ;
			// obj[3]=new Holder<InquiryBalanceResponseType>(new
			// InquiryBalanceResponseType()) ;
			// message.getExchange().getOutMessage().put("client.holders",Arrays.asList(obj));
			// holderInInterceptor.handleMessage(message);

			CachedStream cs = new CachedStream();
			message.setContent(OutputStream.class, cs);

			message.getInterceptorChain().doIntercept(message);
			String channel = String.valueOf(message.getExchange().get(
					"BTLChannel"));
			String terminalId = String.valueOf(message.getExchange().get(
					"HeaderTermId"));

			try {
				cs.flush();
				IOUtils.closeQuietly(cs);
				CachedOutputStream csnew = (CachedOutputStream) message
						.getContent(OutputStream.class);

				String currentEnvelopeMessage = IOUtils.toString(
						csnew.getInputStream(), "UTF-8");
				csnew.flush();
				IOUtils.closeQuietly(csnew);

				// if (getLogger().isDebugEnabled()) {
				// getLogger().debug("Outbound message: " +
				// currentEnvelopeMessage);
				// }

				String res = changeOutboundMessage(currentEnvelopeMessage,
						channel, terminalId);
				// if (res != null) {
				// if (getLogger().isDebugEnabled()) {
				// getLogger().debug("Outbound message has been changed: " +
				// res);
				// }
				// }
				res = res != null ? res : currentEnvelopeMessage;

				InputStream replaceInStream = IOUtils.toInputStream(res,
						"UTF-8");

				IOUtils.copy(replaceInStream, os);
				replaceInStream.close();
				IOUtils.closeQuietly(replaceInStream);

				os.flush();
				message.setContent(OutputStream.class, os);
				IOUtils.closeQuietly(os);
				Exchange exchange = message.getExchange();
				exchange.put(Message.REQUESTOR_ROLE, true);
				message.put(Message.REQUESTOR_ROLE, true);
				message.setContextualProperty("soap.no.validate.parts", true);

			} catch (IOException ioe) {
				// getLogger().warn("Unable to perform change.", ioe);
				throw new RuntimeException(ioe);
			}
		} else {
			try {
				InputStream is = message.getContent(InputStream.class);
				String currentEnvelopeMessage = IOUtils.toString(is, "UTF-8");
				IOUtils.closeQuietly(is);

				// set property for channel to handle POS requests directed by
				// nginx for old POS to handle response to be as posgate
				// response
				if (!currentEnvelopeMessage.contains("Signature")) {
					message.getExchange().put("BTLChannel", "BTL");

					// read terminal id to be used in outbound to set header
					try {
						Matcher matcher = pattern
								.matcher(currentEnvelopeMessage);
						matcher.find();
						matcher.group(1);
						message.getExchange().put("HeaderTermId",
								matcher.group(1));
					} catch (java.lang.IllegalStateException exception) {
						AmanLogger.logInfo(PropertyInit.getLOGGERNAME(),
								"No Match Found");
					}
				}
				// if (getLogger().isDebugEnabled()) {
				// getLogger().debug("Inbound message: " +
				// currentEnvelopeMessage);
				// }

				String res = changeInboundMessage(currentEnvelopeMessage);
				if (res != null) {
					// if (getLogger().isDebugEnabled()) {
					// getLogger().debug("Inbound message has been changed: " +
					// res);
					// }
				}
				res = res != null ? res : currentEnvelopeMessage;

				is = IOUtils.toInputStream(res, "UTF-8");
				message.setContent(InputStream.class, is);
				IOUtils.closeQuietly(is);
				// Exchange exchange= message.getExchange();
				// exchange.put(Message.REQUESTOR_ROLE,false);
				// message.put(Message.REQUESTOR_ROLE,false);
				// message.setContextualProperty("soap.no.validate.parts",
				// true);
				// BindingOperationInfo bop =
				// exchange.getBindingOperationInfo();
				//
				// bop.getBinding().getService().setProperty("soap.force.doclit.bare",new
				// Boolean(true));
				// message.getRequestContext().put("soap.no.validate.parts",
				// "true");
				// message.put("soap.no.validate.parts", true);

				// change this soapMesage what ever you want and set as message
				// Content

			} catch (IOException ioe) {
				// getLogger().warn("Unable to perform change.", ioe);

				throw new RuntimeException(ioe);
			}
		}
	}

	protected String changeOutboundMessage(String currentEnvelope,
			String channelType, String terminalId) {
		currentEnvelope = currentEnvelope.replace(
				"https://raya.paymentplaform.com/egypt/soap/envelope/",
				"http://schemas.xmlsoap.org/soap/envelope/");

		// if uig proxy outbound and daily summery and channel BTL, add message
		// header tag
		if (currentEnvelope.contains("Daily_Summary_Response")
				&& channelType.equals("BTL")) {
			currentEnvelope = currentEnvelope
					.replace(
							"<MessageBody",
							// "<MessageHeader></MessageHeader><MessageBody");
							"<ResponseHeader><Source><BOrgCode>RAYADC</BOrgCode></Source><ClientTSP>2019-07-15T09:26:28+02:00</ClientTSP><TermID>"
									+ terminalId
									+ "</TermID><ChannelType>POS</ChannelType><ClientSeqID>201907150926028</ClientSeqID><MsgCode>405</MsgCode><WSDL_Ver>00.01</WSDL_Ver><ServerTSP>2019-07-15T09:47:57.364+02:00</ServerTSP><Language>ar-eg</Language></ResponseHeader><MessageBody");
			currentEnvelope = currentEnvelope.replace("soap:", "env:");
			currentEnvelope = currentEnvelope
					.replace("xmlns:soap", "xmlns:env");
			currentEnvelope = currentEnvelope.replace(".0", ".00");
		}

		return currentEnvelope;
	}

	protected String changeInboundMessage(String currentEnvelope) {
		currentEnvelope = currentEnvelope.replace(
				"https://raya.paymentplaform.com/egypt/soap/envelope/",
				"http://schemas.xmlsoap.org/soap/envelope/");

		return currentEnvelope;
	}

	private class CachedStream extends CachedOutputStream {
		public CachedStream() {
			super();
		}
	}
}
