
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
    "VendorTransactionId",
    "VendorResponseCode",
    "VendorResponseMessage",
    "giftDescription",
    "giftSeqId",
    "promoId",
    "extradata"
})
@Generated("jsonschema2pojo")
public class VendorResponse implements Serializable
{

    @JsonProperty("VendorTransactionId")
    private String vendorTransactionId;
    @JsonProperty("VendorResponseCode")
    private String vendorResponseCode;
    @JsonProperty("VendorResponseMessage")
    private String vendorResponseMessage;
    @JsonProperty("giftDescription")
    private String giftDescription;
    @JsonProperty("giftSeqId")
    private String giftSeqId;
    @JsonProperty("promoId")
    private String promoId;
    @JsonProperty("extradata")
    private List<Object> extradata = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 6005096402765327715L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public VendorResponse() {
    }

    /**
     * 
     * @param vendorResponseCode
     * @param extradata
     * @param vendorResponseMessage
     * @param giftSeqId
     * @param promoId
     * @param vendorTransactionId
     * @param giftDescription
     */
    public VendorResponse(String vendorTransactionId, String vendorResponseCode, String vendorResponseMessage, String giftDescription, String giftSeqId, String promoId, List<Object> extradata) {
        super();
        this.vendorTransactionId = vendorTransactionId;
        this.vendorResponseCode = vendorResponseCode;
        this.vendorResponseMessage = vendorResponseMessage;
        this.giftDescription = giftDescription;
        this.giftSeqId = giftSeqId;
        this.promoId = promoId;
        this.extradata = extradata;
    }

    @JsonProperty("VendorTransactionId")
    public String getVendorTransactionId() {
        return vendorTransactionId;
    }

    @JsonProperty("VendorTransactionId")
    public void setVendorTransactionId(String vendorTransactionId) {
        this.vendorTransactionId = vendorTransactionId;
    }

    @JsonProperty("VendorResponseCode")
    public String getVendorResponseCode() {
        return vendorResponseCode;
    }

    @JsonProperty("VendorResponseCode")
    public void setVendorResponseCode(String vendorResponseCode) {
        this.vendorResponseCode = vendorResponseCode;
    }

    @JsonProperty("VendorResponseMessage")
    public String getVendorResponseMessage() {
        return vendorResponseMessage;
    }

    @JsonProperty("VendorResponseMessage")
    public void setVendorResponseMessage(String vendorResponseMessage) {
        this.vendorResponseMessage = vendorResponseMessage;
    }

    @JsonProperty("giftDescription")
    public String getGiftDescription() {
        return giftDescription;
    }

    @JsonProperty("giftDescription")
    public void setGiftDescription(String giftDescription) {
        this.giftDescription = giftDescription;
    }

    @JsonProperty("giftSeqId")
    public String getGiftSeqId() {
        return giftSeqId;
    }

    @JsonProperty("giftSeqId")
    public void setGiftSeqId(String giftSeqId) {
        this.giftSeqId = giftSeqId;
    }

    @JsonProperty("promoId")
    public String getPromoId() {
        return promoId;
    }

    @JsonProperty("promoId")
    public void setPromoId(String promoId) {
        this.promoId = promoId;
    }

    @JsonProperty("extradata")
    public List<Object> getExtradata() {
        return extradata;
    }

    @JsonProperty("extradata")
    public void setExtradata(List<Object> extradata) {
        this.extradata = extradata;
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
