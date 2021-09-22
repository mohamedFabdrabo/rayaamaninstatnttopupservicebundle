package com.raya.aman.topupservice.dto;

import java.io.Serializable;

public class TopupRequestDto implements Serializable {
	
	
	private static final long serialVersionUID = 1L;
	
	String msisdn;
	String refrenceNumber;
	double amount;
	String poolId;

	String username;
	String password;
	
	public String getMsisdn() {
		return msisdn;
	}
	public void setMsisdn(String msisdn) {
		this.msisdn = msisdn;
	}
	public String getRefrenceNumber() {
		return refrenceNumber;
	}
	public void setRefrenceNumber(String refrenceNumber) {
		this.refrenceNumber = refrenceNumber;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public String getPoolId() {
		return poolId;
	}
	public void setPoolId(String poolId) {
		this.poolId = poolId;
	}

	public String getUsername() {
		return username;
	}
	public String getPassword() {
		return password;
	}
}
