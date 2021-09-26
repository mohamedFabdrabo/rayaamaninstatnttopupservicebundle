package com.raya.aman.topupservice.dto.mobifindto;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class LoginDTO implements Serializable {
    private static final long serialVersionUID = 1L;
    @JsonGetter("data")
    private LoginDataDTO data;

    public LoginDTO(LoginDataDTO data) {
        this.data = data;
    }

    public LoginDataDTO getData() {
        return data;
    }

    public void setData(LoginDataDTO data) {
        this.data = data;
    }

}
