package com.raya.aman.topupservice.processor.mobifinprocessor;

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
import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.cxf.message.MessageContentsList;
import org.json.JSONArray;
import org.json.JSONObject;

import javax.ws.rs.HttpMethod;
import javax.xml.datatype.DatatypeFactory;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.LinkedHashMap;
import java.util.List;

public class mobifin_TopupPaymentRequestBuilder implements Processor {

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
				"{{" + topupRequestDto.getPoolId() + "_poolId_terminal_new" + "}}");
		String pin = exchange.getContext().resolvePropertyPlaceholders(
				"{{" + topupRequestDto.getPoolId() + "_poolId_PIN_new" + "}}");
		String networkServiceCode = exchange.getContext()
				.resolvePropertyPlaceholders(
						"{{" + networkCode + "_serviceCode_new" + "}}");
		double cafPercentage = Double
				.valueOf(exchange.getContext().resolvePropertyPlaceholders(
						"{{" + networkCode + "_caf" + "}}"));
		double topupAmount = topupRequestDto.getAmount() / cafPercentage;
		double caf = topupRequestDto.getAmount() - topupAmount;


		String username = exchange.getContext().resolvePropertyPlaceholders(
				"{{username}}");
		String password = exchange.getContext().resolvePropertyPlaceholders(
				"{{password}}");

		Object body  = exchange.getIn().getBody();
		String token = ((JSONObject) body).getJSONObject("data").getString("access_token");

		// Create The request
		JSONObject requestBody = new JSONObject();
		JSONObject data = new JSONObject();

		// from_user
		JSONObject fromUser = new JSONObject();
		fromUser.put("userIdentifier",username);

		// Payment
		JSONArray payment = new JSONArray();
		JSONObject one_payment = new JSONObject();
		one_payment.put("amount",roundAmount(topupAmount));// TODO Check logic (CAF)
		one_payment.put("unitType", "EMONEY");
		one_payment.put("currency", "EGP");
		one_payment.put("exponent", "0");
		payment.put(one_payment);

		// data
		data.put("fromUser",fromUser);
		data.put("payment",payment);
		data.put("serviceId",generateServiceID(networkCode));
		data.put("productId",generateProductID(networkCode));// 010,011,012,015
		data.put("Referencenumber",topupRequestDto.getRefrenceNumber());
		data.put("remarks","");
		data.put("requestId",generateRequestId(topupRequestDto.getRefrenceNumber()));
		data.put("mpin",password);

		// top up request
		requestBody.put("data",data);

		exchange.getIn().setBody(requestBody);
		exchange.getIn().setHeaders(new LinkedHashMap<String, Object>());
		exchange.getIn().setHeader(Exchange.HTTP_METHOD, HttpMethod.POST);
		exchange.getIn().setHeader(Exchange.CONTENT_TYPE, "application/json");
		exchange.getIn().setHeader(
				"Authorization",
				"Bearer "
						+ token);
	}

	private String generateServiceID(String networkServiceCode) {
		String ServiceID = "";
		if (networkServiceCode.equals("010"))
		{
			ServiceID = "VODAFONE_TOP_UP";
		}
		if(networkServiceCode.equals("011"))
		{
			ServiceID = "ETISALAT_TOP_UP";
		}
		if (networkServiceCode.equals("015"))
		{
			ServiceID = "WE_MOBILE_TOP_UP";
		}
		if (networkServiceCode.equals("012"))
		{
			ServiceID = "ORANGE_TOP_UP";
		}

		return ServiceID;

	}	private String generateProductID(String networkServiceCode) {
		String ProductID = "";
		if (networkServiceCode.equals("010"))
		{
			ProductID = "VODAFONE_TOP_UP_5-200";
		}
		if(networkServiceCode.equals("011"))
		{
			ProductID = "ETISALAT_TOP_UP_5-200";
		}
		if (networkServiceCode.equals("015"))
		{
			ProductID = "WE_MOBILE_TOP_UP";
		}
		if (networkServiceCode.equals("012"))
		{
			ProductID = "ORANGE_TOP_UP_5-500";
		}

		return ProductID;

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
