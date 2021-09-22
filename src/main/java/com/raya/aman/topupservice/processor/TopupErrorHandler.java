package com.raya.aman.topupservice.processor;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.cxf.message.MessageContentsList;

import com.paymentplaform.raya.gate.init.InitPaymentResponseType;
import com.raya.aman.logger.AmanLogger;
import com.raya.aman.util.configuration.PropertyInit;

public class TopupErrorHandler implements Processor {

	public void process(Exchange exchange) throws Exception {
		Object responseBody = exchange.getIn().getBody();
		AmanLogger.logInfo(PropertyInit.getLOGGERNAME(),
				"Insid TopupErrorHandler processor");
		AmanLogger.logInfo(PropertyInit.getLOGGERNAME(), "Response Data: "
				+ responseBody);

		if (responseBody == null) {
			exchange.setProperty("topupResponseCode", 300001);

		} else {
			MessageContentsList contentList = (MessageContentsList) responseBody;
			InitPaymentResponseType response = (InitPaymentResponseType) contentList
					.get(4);
			String responseCode = response.getInitPaymentResponse().getStatus()
					.getResponseCode();
			if (!responseCode.equals("0")) {

				exchange.setProperty("topupResponseCode", 300001);

			}
		}

	}

}
