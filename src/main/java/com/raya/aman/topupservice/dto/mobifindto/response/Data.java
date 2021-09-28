package com.raya.aman.topupservice.dto.mobifindto.response;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
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
    "transactionStatus",
    "transactionId",
    "eventTime",
    "service",
    "balanceData",
    "Summary of Transaction Details"
})
@Generated("jsonschema2pojo")
public class Data implements Serializable
{

    @JsonProperty("transactionStatus")
    private String transactionStatus;
    @JsonProperty("transactionId")
    private String transactionId;
    @JsonProperty("eventTime")
    private String eventTime;
    @JsonProperty("service")
    private String service;
    @JsonProperty("balanceData")
    private List<BalanceDatum> balanceData = null;
    @JsonProperty("Summary of Transaction Details")
    private List<SummaryOfTransactionDetail> summaryOfTransactionDetails = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -4741984168520054817L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Data() {
    }

    /**
     * 
     * @param transactionStatus
     * @param service
     * @param eventTime
     * @param balanceData
     * @param summaryOfTransactionDetails
     * @param transactionId
     */
    public Data(String transactionStatus, String transactionId, String eventTime, String service, List<BalanceDatum> balanceData, List<SummaryOfTransactionDetail> summaryOfTransactionDetails) {
        super();
        this.transactionStatus = transactionStatus;
        this.transactionId = transactionId;
        this.eventTime = eventTime;
        this.service = service;
        this.balanceData = balanceData;
        this.summaryOfTransactionDetails = summaryOfTransactionDetails;
    }

    @JsonProperty("transactionStatus")
    public String getTransactionStatus() {
        return transactionStatus;
    }

    @JsonProperty("transactionStatus")
    public void setTransactionStatus(String transactionStatus) {
        this.transactionStatus = transactionStatus;
    }

    @JsonProperty("transactionId")
    public String getTransactionId() {
        return transactionId;
    }

    @JsonProperty("transactionId")
    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    @JsonProperty("eventTime")
    public String getEventTime() {
        return eventTime;
    }

    @JsonProperty("eventTime")
    public void setEventTime(String eventTime) {
        this.eventTime = eventTime;
    }

    @JsonProperty("service")
    public String getService() {
        return service;
    }

    @JsonProperty("service")
    public void setService(String service) {
        this.service = service;
    }

    @JsonProperty("balanceData")
    public List<BalanceDatum> getBalanceData() {
        return balanceData;
    }

    @JsonProperty("balanceData")
    public void setBalanceData(List<BalanceDatum> balanceData) {
        this.balanceData = balanceData;
    }

    @JsonProperty("Summary of Transaction Details")
    public List<SummaryOfTransactionDetail> getSummaryOfTransactionDetails() {
        return summaryOfTransactionDetails;
    }

    @JsonProperty("Summary of Transaction Details")
    public void setSummaryOfTransactionDetails(List<SummaryOfTransactionDetail> summaryOfTransactionDetails) {
        this.summaryOfTransactionDetails = summaryOfTransactionDetails;
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
