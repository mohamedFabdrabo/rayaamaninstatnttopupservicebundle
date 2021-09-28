
package com.raya.aman.topupservice.dto.mobifindto.response;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "External Receiver",
    "Phone",
    "Transaction Amount",
    "Transaction Unit",
    "Unit Amount",
    "Service",
    "Receiver Name(English)",
    "Receiver Name(Arabic)",
    "Sender Name(English)",
    "Sender Name(Arabic)",
    "Remarks"
})
@Generated("jsonschema2pojo")
public class SummaryOfTransactionDetail implements Serializable
{

    @JsonProperty("External Receiver")
    private String externalReceiver;
    @JsonProperty("Phone")
    private String phone;
    @JsonProperty("Transaction Amount")
    private String transactionAmount;
    @JsonProperty("Transaction Unit")
    private String transactionUnit;
    @JsonProperty("Unit Amount")
    private String unitAmount;
    @JsonProperty("Service")
    private String service;
    @JsonProperty("Receiver Name(English)")
    private String receiverNameEnglish;
    @JsonProperty("Receiver Name(Arabic)")
    private String receiverNameArabic;
    @JsonProperty("Sender Name(English)")
    private String senderNameEnglish;
    @JsonProperty("Sender Name(Arabic)")
    private String senderNameArabic;
    @JsonProperty("Remarks")
    private String remarks;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -2689187264947533275L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public SummaryOfTransactionDetail() {
    }

    /**
     * 
     * @param senderNameEnglish
     * @param receiverNameArabic
     * @param phone
     * @param service
     * @param transactionAmount
     * @param unitAmount
     * @param receiverNameEnglish
     * @param externalReceiver
     * @param transactionUnit
     * @param remarks
     * @param senderNameArabic
     */
    public SummaryOfTransactionDetail(String externalReceiver, String phone, String transactionAmount, String transactionUnit, String unitAmount, String service, String receiverNameEnglish, String receiverNameArabic, String senderNameEnglish, String senderNameArabic, String remarks) {
        super();
        this.externalReceiver = externalReceiver;
        this.phone = phone;
        this.transactionAmount = transactionAmount;
        this.transactionUnit = transactionUnit;
        this.unitAmount = unitAmount;
        this.service = service;
        this.receiverNameEnglish = receiverNameEnglish;
        this.receiverNameArabic = receiverNameArabic;
        this.senderNameEnglish = senderNameEnglish;
        this.senderNameArabic = senderNameArabic;
        this.remarks = remarks;
    }

    @JsonProperty("External Receiver")
    public String getExternalReceiver() {
        return externalReceiver;
    }

    @JsonProperty("External Receiver")
    public void setExternalReceiver(String externalReceiver) {
        this.externalReceiver = externalReceiver;
    }

    @JsonProperty("Phone")
    public String getPhone() {
        return phone;
    }

    @JsonProperty("Phone")
    public void setPhone(String phone) {
        this.phone = phone;
    }

    @JsonProperty("Transaction Amount")
    public String getTransactionAmount() {
        return transactionAmount;
    }

    @JsonProperty("Transaction Amount")
    public void setTransactionAmount(String transactionAmount) {
        this.transactionAmount = transactionAmount;
    }

    @JsonProperty("Transaction Unit")
    public String getTransactionUnit() {
        return transactionUnit;
    }

    @JsonProperty("Transaction Unit")
    public void setTransactionUnit(String transactionUnit) {
        this.transactionUnit = transactionUnit;
    }

    @JsonProperty("Unit Amount")
    public String getUnitAmount() {
        return unitAmount;
    }

    @JsonProperty("Unit Amount")
    public void setUnitAmount(String unitAmount) {
        this.unitAmount = unitAmount;
    }

    @JsonProperty("Service")
    public String getService() {
        return service;
    }

    @JsonProperty("Service")
    public void setService(String service) {
        this.service = service;
    }

    @JsonProperty("Receiver Name(English)")
    public String getReceiverNameEnglish() {
        return receiverNameEnglish;
    }

    @JsonProperty("Receiver Name(English)")
    public void setReceiverNameEnglish(String receiverNameEnglish) {
        this.receiverNameEnglish = receiverNameEnglish;
    }

    @JsonProperty("Receiver Name(Arabic)")
    public String getReceiverNameArabic() {
        return receiverNameArabic;
    }

    @JsonProperty("Receiver Name(Arabic)")
    public void setReceiverNameArabic(String receiverNameArabic) {
        this.receiverNameArabic = receiverNameArabic;
    }

    @JsonProperty("Sender Name(English)")
    public String getSenderNameEnglish() {
        return senderNameEnglish;
    }

    @JsonProperty("Sender Name(English)")
    public void setSenderNameEnglish(String senderNameEnglish) {
        this.senderNameEnglish = senderNameEnglish;
    }

    @JsonProperty("Sender Name(Arabic)")
    public String getSenderNameArabic() {
        return senderNameArabic;
    }

    @JsonProperty("Sender Name(Arabic)")
    public void setSenderNameArabic(String senderNameArabic) {
        this.senderNameArabic = senderNameArabic;
    }

    @JsonProperty("Remarks")
    public String getRemarks() {
        return remarks;
    }

    @JsonProperty("Remarks")
    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
