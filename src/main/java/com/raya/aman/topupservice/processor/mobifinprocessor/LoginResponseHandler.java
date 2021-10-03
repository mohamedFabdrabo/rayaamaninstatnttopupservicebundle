package com.raya.aman.topupservice.processor.mobifinprocessor;

import com.raya.aman.topupservice.dto.TopupRequestDto;
import com.raya.aman.topupservice.dto.mobifindto.LoginResponseDTO;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.cxf.message.MessageContentsList;

import java.util.ArrayList;
import java.util.List;

public class LoginResponseHandler implements Processor {
    public void process(Exchange exchange) throws Exception {
        LoginResponseDTO loginResponse  = exchange.getIn().getBody(
                LoginResponseDTO.class);
        if(loginResponse!=null) {
            String token = loginResponse.getData().getAccess_token();
            exchange.setProperty("token", token);
        }
        else {
            exchange.setProperty("token", "-1");
        }
    }
}
