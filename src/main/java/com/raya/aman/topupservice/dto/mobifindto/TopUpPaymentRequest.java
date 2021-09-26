package com.raya.aman.topupservice.dto.mobifindto;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import java.io.Serializable;

@JsonInclude(Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class TopUpPaymentRequest implements Serializable {

    private TopUpPaymentData data;

    public TopUpPaymentRequest(TopUpPaymentData data) {
        this.data = data;
    }

    public TopUpPaymentRequest() {
    }

    public TopUpPaymentData getData() {
        return data;
    }

    public void setData(TopUpPaymentData data) {
        this.data = data;
    }
}
