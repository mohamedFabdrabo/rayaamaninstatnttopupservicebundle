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
    "latestVersion"
})
@Generated("jsonschema2pojo")
public class ServiceDirectory implements Serializable
{

    @JsonProperty("latestVersion")
    private String latestVersion;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -8819067160126895959L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ServiceDirectory() {
    }

    /**
     * 
     * @param latestVersion
     */
    public ServiceDirectory(String latestVersion) {
        super();
        this.latestVersion = latestVersion;
    }

    @JsonProperty("latestVersion")
    public String getLatestVersion() {
        return latestVersion;
    }

    @JsonProperty("latestVersion")
    public void setLatestVersion(String latestVersion) {
        this.latestVersion = latestVersion;
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
