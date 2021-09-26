package com.raya.aman.topupservice.dto.mobifindto;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class TopUpPaymentData implements Serializable {
    private static final long serialVersionUID = 1L;
    private FromUserDTO fromUser;
    private PaymentDTO[] payment;
    private String serviceId;
    private String productId;
    private String Referencenumber;
    private String remarks;
    private String requestId;
    private String mpin;

    public TopUpPaymentData(FromUserDTO fromUser, PaymentDTO[] payment, String serviceId, String productId,
                            String referencenumber, String remarks, String requestId, String mpin) {
        this.fromUser = fromUser;
        this.payment = payment;
        this.serviceId = serviceId;
        this.productId = productId;
        Referencenumber = referencenumber;
        this.remarks = remarks;
        this.requestId = requestId;
        this.mpin = mpin;
    }

    public FromUserDTO getFromUser() {
        return fromUser;
    }

    public void setFromUser(FromUserDTO fromUser) {
        this.fromUser = fromUser;
    }

    public PaymentDTO[] getPayment() {
        return payment;
    }

    public void setPayment(PaymentDTO[] payment) {
        this.payment = payment;
    }

    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getReferencenumber() {
        return Referencenumber;
    }

    public void setReferencenumber(String referencenumber) {
        Referencenumber = referencenumber;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public String getMpin() {
        return mpin;
    }

    public void setMpin(String mpin) {
        this.mpin = mpin;
    }
}
