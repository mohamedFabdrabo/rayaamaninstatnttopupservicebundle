package com.raya.aman.topupservice.processor.mobifinprocessor;

import com.paymentplaform.raya.gate.init.InitPaymentResponse;
import com.paymentplaform.raya.gate.init.InitPaymentResponseType;
import com.raya.aman.topupservice.dto.TopupRequestDto;
import com.raya.aman.topupservice.dto.TopupResponseDto;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.json.JSONObject;

public class mobifin_TopupPaymentResponseHandler implements Processor {

	public void process(Exchange exchange) throws Exception {

		TopupResponseDto responsDto = new TopupResponseDto();
		TopupRequestDto requestDto = exchange.getProperty("topupRequestDto",
				TopupRequestDto.class);

		JSONObject response = exchange.getIn().getBody(
				JSONObject.class);
		if (response != null) {
			JSONObject initPaymentResponse = response;

			responsDto.getStatus().setCode(
					Integer.valueOf(initPaymentResponse.getString("responseCode")));
			responsDto.getStatus().setMessage(initPaymentResponse.getString("responseMessage"));
			responsDto.setRefrenceNumber(requestDto.getRefrenceNumber());
			responsDto.setTransactionNumber(initPaymentResponse.getJSONObject("data").getString("transactionStatus"));
		} else {
			responsDto.getStatus().setCode(300001);
			responsDto.getStatus().setMessage("Error during charge");
			responsDto.setRefrenceNumber(requestDto.getRefrenceNumber());
		}

		exchange.getIn().setBody(responsDto);

	}

}
