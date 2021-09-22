package com.raya.aman.topupservice.processor.mobifinprocessor;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.json.JSONObject;
import javax.ws.rs.HttpMethod;
import java.util.LinkedHashMap;

public class LoginHandler implements Processor {
    @Override
    public void process(Exchange exchange) throws Exception {
        String username = exchange.getContext().resolvePropertyPlaceholders(
                "{{username}}");
        String password = exchange.getContext().resolvePropertyPlaceholders(
                "{{password}}");

        JSONObject RequestBody = new JSONObject();
        JSONObject data = new JSONObject();
        data.put("grantType","password");
        data.put("username",username);
        data.put("password",password);
        data.put("deviceUniqueId",username);//TODO check logic
        RequestBody.put("data",data);

        //TODO static values used for auth
        String Auth_username = "";
        String Auth_password = "";

        exchange.getIn().setHeaders(new LinkedHashMap<String, Object>());
        exchange.getIn().setHeader(Exchange.HTTP_METHOD, HttpMethod.POST);
        exchange.getIn().setHeader(Exchange.CONTENT_TYPE, "application/json");

        exchange.getIn().setBody(RequestBody);//check
    }
}
