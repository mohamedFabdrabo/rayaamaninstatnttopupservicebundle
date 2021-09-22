package com.raya.aman.topupservice.processor;

import java.util.ArrayList;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

public class NetworkTypsHandler implements Processor {

	public void process(Exchange exchange) throws Exception {

		String serviceCode = exchange.getProperty("networkCode", String.class);
		ArrayList<String> networkTypList = exchange.getProperty(
				"networkTypList", ArrayList.class);

		networkTypList.remove(serviceCode);

		if (networkTypList.size() > 0) {
			exchange.setProperty("networkCode", networkTypList.get(0));
		}

		exchange.setProperty("networkTypListSize", networkTypList.size());

	}

}
