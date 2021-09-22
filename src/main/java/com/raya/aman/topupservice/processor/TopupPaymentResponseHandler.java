package com.raya.aman.topupservice.processor;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

import com.paymentplaform.raya.gate.init.InitPaymentResponse;
import com.paymentplaform.raya.gate.init.InitPaymentResponseType;
import com.raya.aman.topupservice.dto.TopupRequestDto;
import com.raya.aman.topupservice.dto.TopupResponseDto;

public class TopupPaymentResponseHandler implements Processor {

	public void process(Exchange exchange) throws Exception {

		TopupResponseDto responsDto = new TopupResponseDto();
		TopupRequestDto requestDto = exchange.getProperty("topupRequestDto",
				TopupRequestDto.class);

		InitPaymentResponseType response = exchange.getIn().getBody(
				InitPaymentResponseType.class);
		if (response != null) {
			InitPaymentResponse initPaymentResponse = response
					.getInitPaymentResponse();

			responsDto.getStatus().setCode(
					Integer.valueOf(initPaymentResponse.getStatus()
							.getResponseCode()));
			responsDto.getStatus().setMessage(
					initPaymentResponse.getStatus().getResponseDesc());
			responsDto.setRefrenceNumber(requestDto.getRefrenceNumber());
			responsDto.setTransactionNumber(initPaymentResponse.getTrxnIds()
					.getTrxnIds().get(0).getTrxnIdValue());
		} else {
			responsDto.getStatus().setCode(300001);
			responsDto.getStatus().setMessage("Error during charge");
			responsDto.setRefrenceNumber(requestDto.getRefrenceNumber());

		}

		exchange.getIn().setBody(responsDto);

	}

}
