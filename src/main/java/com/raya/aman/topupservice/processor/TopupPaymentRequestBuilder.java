package com.raya.aman.topupservice.processor;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

import javax.xml.datatype.DatatypeFactory;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.cxf.message.MessageContentsList;

import com.paymentplaform.raya.gate.EnumChannelType;
import com.paymentplaform.raya.gate.EnumCurrencyCode;
import com.paymentplaform.raya.gate.EnumTransType;
import com.paymentplaform.raya.gate.RequestHeader;
import com.paymentplaform.raya.gate.init.InitPaymentRequest;
import com.paymentplaform.raya.gate.init.InitPaymentRequest.DRAcct;
import com.paymentplaform.raya.gate.init.InitPaymentRequest.PayAmt;
import com.paymentplaform.raya.gate.init.InitPaymentRequest.ServiceData;
import com.paymentplaform.raya.gate.init.InitPaymentRequest.ServiceData.PaymentParameters;
import com.paymentplaform.raya.gate.init.MessageBody;
import com.paymentplaform.raya.gate.init.MessageHeader;
import com.raya.aman.logger.AmanLogger;
import com.raya.aman.topupservice.dto.TopupRequestDto;
import com.raya.aman.util.configuration.PropertyInit;
import com.raya.aman.util.exception.CustomException;

public class TopupPaymentRequestBuilder implements Processor {

	public void process(Exchange exchange) throws Exception {

		TopupRequestDto topupRequestDto = exchange.getProperty(
				"topupRequestDto", TopupRequestDto.class);

		if (topupRequestDto == null) {
			AmanLogger.logError(PropertyInit.getLOGGERNAME(), "",
					"topupRequestDto is NULL");
			throw new CustomException(exchange.getContext()
					.resolvePropertyPlaceholders("{{169999}}"), "300001");

		}

		String networkCode = exchange.getProperty("networkCode", String.class);

		String terminalId = exchange.getContext().resolvePropertyPlaceholders(
				"{{" + topupRequestDto.getPoolId() + "_poolId_terminal" + "}}");
		String pin = exchange.getContext().resolvePropertyPlaceholders(
				"{{" + topupRequestDto.getPoolId() + "_poolId_PIN" + "}}");
		String networkServiceCode = exchange.getContext()
				.resolvePropertyPlaceholders(
						"{{" + networkCode + "_serviceCode" + "}}");
		double cafPercentage = Double
				.valueOf(exchange.getContext().resolvePropertyPlaceholders(
						"{{" + networkCode + "_caf" + "}}"));


		// Create The request Using XML Type object
		InitPaymentRequest initPaymentRequest = new InitPaymentRequest();

		MessageBody messageBody = new MessageBody();

		double topupAmount = topupRequestDto.getAmount() / cafPercentage;
		double caf = topupRequestDto.getAmount() - topupAmount;

		AmanLogger.logInfo((PropertyInit.getLOGGERNAME()), "========= amont: "
				+ topupRequestDto.getAmount() + " ====== topupAmount :   "
				+ topupAmount + " ===== calculated CAF: " + caf + "=========");
		// create payment request
		PayAmt payAmt = new PayAmt();
		payAmt.setAmount(roundAmount(topupAmount));
		payAmt.setChargesAmount(roundAmount(caf));
		payAmt.setCurrencyCode(EnumCurrencyCode.EGP);
		initPaymentRequest.setPayAmt(payAmt);
		initPaymentRequest.setRqUID(generateRequestId(topupRequestDto
				.getRefrenceNumber()));
		initPaymentRequest.setServiceCode(networkServiceCode);
		initPaymentRequest.setTrxnType(EnumTransType.TOPUP);
		initPaymentRequest.setPaymentMethod("Cash");

		DRAcct acct = new DRAcct();
		acct.setFundBOrg("Org1");
		List<PaymentParameters> paymentParams = new ArrayList();

		PaymentParameters externalRefNumParam = new PaymentParameters();

		externalRefNumParam.setParameterKey("ExternalRefNum");
		externalRefNumParam.setParameterValue(topupRequestDto
				.getRefrenceNumber());

		PaymentParameters poolIdParam = new PaymentParameters();

		poolIdParam.setParameterKey("poolId");
		poolIdParam.setParameterValue(topupRequestDto.getPoolId());

		paymentParams.add(externalRefNumParam);
		paymentParams.add(poolIdParam);
		ServiceData serviceData = new ServiceData();

		serviceData.setServiceReferenceNumber(topupRequestDto.getMsisdn());
		serviceData.setPaymentParameters(paymentParams);
		serviceData.setBillRefNumber(topupRequestDto.getRefrenceNumber());
		initPaymentRequest.setServiceData(serviceData);

		acct.setFundBOrg("Org1");
		acct.setTermID(terminalId);
		acct.setDRAcctNo(terminalId);
		acct.setPIN(pin);
		acct.setCurrencyCode(EnumCurrencyCode.EGP);

		initPaymentRequest.setDRAcct(acct);

		// create message
		MessageHeader messageHeader = new MessageHeader();
		RequestHeader requestHeader = new RequestHeader();

		requestHeader.setTermID(terminalId);
		requestHeader.setLanguage("ar-eg");
		requestHeader.setChannelType(EnumChannelType.BTL);
		requestHeader.setClientTSP(DatatypeFactory.newInstance()
				.newXMLGregorianCalendar(new GregorianCalendar()));

		messageHeader.setRequestHeader(requestHeader);

		messageBody.setInitPaymentRequest(initPaymentRequest);
		MessageContentsList contentsList = new MessageContentsList(
				messageHeader, messageBody);
		// exchange.getIn().setHeaders(
		// (Map<String, Object>) exchange.getProperty("initialHeader"));

		exchange.getIn().setHeader("operationName", "InitPayment");
		exchange.getIn().setHeader("operationNamespace",
				"http://raya.paymentplaform.com/gate");
		exchange.getIn().setHeader("SOAPAction",
				"http://raya.paymentplaform.com/InitPayment");

		exchange.getIn().setBody(contentsList);

	}

	private String generateRequestId(String referenceNumber) {

		String requestId = "";

		requestId = referenceNumber + "_" + referenceNumber.hashCode();

		return requestId;

	}

	private double roundAmount(double amount) {

		double roundedAmount = 0.0;
		DecimalFormat df = new DecimalFormat("0.00");
		roundedAmount = Double.valueOf(df.format(amount));
		return roundedAmount;
	}

}
