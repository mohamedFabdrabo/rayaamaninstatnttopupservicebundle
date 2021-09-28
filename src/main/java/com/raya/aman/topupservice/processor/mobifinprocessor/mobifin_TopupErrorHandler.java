package com.raya.aman.topupservice.processor.mobifinprocessor;

import com.paymentplaform.raya.gate.init.InitPaymentResponseType;
import com.raya.aman.logger.AmanLogger;
import com.raya.aman.topupservice.dto.mobifindto.response.TopUpPaymentResponse;
import com.raya.aman.util.configuration.PropertyInit;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.cxf.message.MessageContentsList;
import org.json.JSONObject;

public class mobifin_TopupErrorHandler implements Processor {

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
			TopUpPaymentResponse response = (TopUpPaymentResponse) contentList.get(4);
			String responseCode = (String) response.getResponseCode();
			if (!responseCode.equals("1")) {//TODO check value 0 or 1

				exchange.setProperty("topupResponseCode", 300001);

			}
		}

	}

}
