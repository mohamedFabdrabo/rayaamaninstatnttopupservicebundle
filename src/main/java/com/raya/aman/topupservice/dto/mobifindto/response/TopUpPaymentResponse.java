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
    "data",
    "responseCode",
    "responseMessage",
    "VendorResponse",
    "ServiceDirectory"
})
@Generated("jsonschema2pojo")
public class TopUpPaymentResponse implements Serializable
{

    @JsonProperty("data")
    private Data data;
    @JsonProperty("responseCode")
    private String responseCode;
    @JsonProperty("responseMessage")
    private String responseMessage;
    @JsonProperty("VendorResponse")
    private List<VendorResponse> vendorResponse = null;
    @JsonProperty("ServiceDirectory")
    private ServiceDirectory serviceDirectory;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -8466720826135198992L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public TopUpPaymentResponse() {
    }

    /**
     * 
     * @param serviceDirectory
     * @param vendorResponse
     * @param data
     * @param responseMessage
     * @param responseCode
     */
    public TopUpPaymentResponse(Data data, String responseCode, String responseMessage, List<VendorResponse> vendorResponse, ServiceDirectory serviceDirectory) {
        super();
        this.data = data;
        this.responseCode = responseCode;
        this.responseMessage = responseMessage;
        this.vendorResponse = vendorResponse;
        this.serviceDirectory = serviceDirectory;
    }

    @JsonProperty("data")
    public Data getData() {
        return data;
    }

    @JsonProperty("data")
    public void setData(Data data) {
        this.data = data;
    }

    @JsonProperty("responseCode")
    public String getResponseCode() {
        return responseCode;
    }

    @JsonProperty("responseCode")
    public void setResponseCode(String responseCode) {
        this.responseCode = responseCode;
    }

    @JsonProperty("responseMessage")
    public String getResponseMessage() {
        return responseMessage;
    }

    @JsonProperty("responseMessage")
    public void setResponseMessage(String responseMessage) {
        this.responseMessage = responseMessage;
    }

    @JsonProperty("VendorResponse")
    public List<VendorResponse> getVendorResponse() {
        return vendorResponse;
    }

    @JsonProperty("VendorResponse")
    public void setVendorResponse(List<VendorResponse> vendorResponse) {
        this.vendorResponse = vendorResponse;
    }

    @JsonProperty("ServiceDirectory")
    public ServiceDirectory getServiceDirectory() {
        return serviceDirectory;
    }

    @JsonProperty("ServiceDirectory")
    public void setServiceDirectory(ServiceDirectory serviceDirectory) {
        this.serviceDirectory = serviceDirectory;
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
