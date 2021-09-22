package com.raya.aman.topupservice.dto;

import java.io.Serializable;

public class Status implements Serializable {


	private static final long serialVersionUID = 1L;
	
	int code;
	String message;
	
	
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	
	
	
	

}
