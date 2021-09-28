
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
    "updated balance",
    "walletExternalId",
    "pouchExternalId"
})
@Generated("jsonschema2pojo")
public class BalanceDatum implements Serializable
{

    @JsonProperty("updated balance")
    private String updatedBalance;
    @JsonProperty("walletExternalId")
    private String walletExternalId;
    @JsonProperty("pouchExternalId")
    private String pouchExternalId;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 8538865404331741610L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public BalanceDatum() {
    }

    /**
     * 
     * @param pouchExternalId
     * @param updatedBalance
     * @param walletExternalId
     */
    public BalanceDatum(String updatedBalance, String walletExternalId, String pouchExternalId) {
        super();
        this.updatedBalance = updatedBalance;
        this.walletExternalId = walletExternalId;
        this.pouchExternalId = pouchExternalId;
    }

    @JsonProperty("updated balance")
    public String getUpdatedBalance() {
        return updatedBalance;
    }

    @JsonProperty("updated balance")
    public void setUpdatedBalance(String updatedBalance) {
        this.updatedBalance = updatedBalance;
    }

    @JsonProperty("walletExternalId")
    public String getWalletExternalId() {
        return walletExternalId;
    }

    @JsonProperty("walletExternalId")
    public void setWalletExternalId(String walletExternalId) {
        this.walletExternalId = walletExternalId;
    }

    @JsonProperty("pouchExternalId")
    public String getPouchExternalId() {
        return pouchExternalId;
    }

    @JsonProperty("pouchExternalId")
    public void setPouchExternalId(String pouchExternalId) {
        this.pouchExternalId = pouchExternalId;
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
