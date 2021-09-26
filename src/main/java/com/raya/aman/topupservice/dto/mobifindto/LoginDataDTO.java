package com.raya.aman.topupservice.dto.mobifindto;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class LoginDataDTO implements Serializable {
    private static final long serialVersionUID = 1L;
    @JsonGetter("grantType")
    private String grantType;
    @JsonGetter("username")
    private String username;
    @JsonGetter("password")
    private String password;
    @JsonGetter("deviceUniqueId")
    private String deviceUniqueId;

    public LoginDataDTO(String grantType, String username, String password, String deviceUniqueId) {
        this.grantType = grantType;
        this.username = username;
        this.password = password;
        this.deviceUniqueId = deviceUniqueId;
    }


    public String getGrantType() {
        return grantType;
    }

    public void setGrantType(String grantType) {
        this.grantType = grantType;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDeviceUniqueId() {
        return deviceUniqueId;
    }

    public void setDeviceUniqueId(String deviceUniqueId) {
        this.deviceUniqueId = deviceUniqueId;
    }
}