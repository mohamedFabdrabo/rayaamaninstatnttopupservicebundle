package com.raya.aman.topupservice.processor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.cxf.message.MessageContentsList;

import com.raya.aman.topupservice.dto.TopupRequestDto;

public class RequestHandler implements Processor {

	public void process(Exchange exchange) throws Exception {

		// Getting network types prefix and set as properties in the exchange
		String networkTyps = exchange.getContext().resolvePropertyPlaceholders(
				"{{network_types}}");
		List<String> networkTypList = new ArrayList<String>();
		for (String type : networkTyps.split(",")) {

			networkTypList.add(type);
		}

		TopupRequestDto topupRequestDto = (TopupRequestDto) ((MessageContentsList) exchange
				.getIn().getBody()).get(0);

		exchange.setProperty("topupRequestDto", topupRequestDto);

		// remove the network prefix of the phone number to don't retry twice on
		// the same network.
		String serviceCode = topupRequestDto.getMsisdn().trim().substring(0, 3);
		networkTypList.remove(serviceCode);

		exchange.setProperty("networkTypList", networkTypList);
		exchange.setProperty("networkCode", serviceCode);
		exchange.setProperty("networkTypListSize", networkTypList.size());

	}

}
