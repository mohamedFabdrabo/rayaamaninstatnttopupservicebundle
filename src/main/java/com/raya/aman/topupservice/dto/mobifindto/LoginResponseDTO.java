package com.raya.aman.topupservice.dto.mobifindto;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class LoginResponseDTO implements Serializable {
    private static final long serialVersionUID = 1L;
    private LoginResponseData data;
    private String responseCode;
    private String responseMessage;
    private String tenantId;
    private String AccountStatus;
    private String UserCategory;
    private String FAILURELOGINATTEMPT;

    public LoginResponseData getData() {
        return data;
    }

    public void setData(LoginResponseData data) {
        this.data = data;
    }

    public String getResponseCode() {
        return responseCode;
    }

    public void setResponseCode(String responseCode) {
        this.responseCode = responseCode;
    }

    public String getResponseMessage() {
        return responseMessage;
    }

    public void setResponseMessage(String responseMessage) {
        this.responseMessage = responseMessage;
    }

    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    public String getAccountStatus() {
        return AccountStatus;
    }

    public void setAccountStatus(String accountStatus) {
        AccountStatus = accountStatus;
    }

    public String getUserCategory() {
        return UserCategory;
    }

    public void setUserCategory(String userCategory) {
        UserCategory = userCategory;
    }

    public String getFAILURELOGINATTEMPT() {
        return FAILURELOGINATTEMPT;
    }

    public void setFAILURELOGINATTEMPT(String FAILURELOGINATTEMPT) {
        this.FAILURELOGINATTEMPT = FAILURELOGINATTEMPT;
    }

    @JsonInclude(Include.NON_NULL)
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class LoginResponseData implements Serializable{
        private static final long serialVersionUID = 1L;
        private String access_token;
        private String twoFactorEnable;
        private String accessTokenExpiry;

        public String getAccess_token() {
            return access_token;
        }

        public void setAccess_token(String access_token) {
            this.access_token = access_token;
        }

        public String getTwoFactorEnable() {
            return twoFactorEnable;
        }

        public void setTwoFactorEnable(String twoFactorEnable) {
            this.twoFactorEnable = twoFactorEnable;
        }

        public String getAccessTokenExpiry() {
            return accessTokenExpiry;
        }

        public void setAccessTokenExpiry(String accessTokenExpiry) {
            this.accessTokenExpiry = accessTokenExpiry;
        }
    }
}
