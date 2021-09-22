package com.raya.aman.topupservice.dto;

import java.io.Serializable;

public class TopupResponseDto implements Serializable {

	private static final long serialVersionUID = 1L;
	
	Status status;
	String transactionNumber;
	String refrenceNumber;
	
	public TopupResponseDto(){
		
		this.status = new Status();
	}
	
	
	public Status getStatus() {
		return status;
	}
	public void setStatus(Status status) {
		this.status = status;
	}
	public String getTransactionNumber() {
		return transactionNumber;
	}
	public void setTransactionNumber(String transactionNumber) {
		this.transactionNumber = transactionNumber;
	}
	public String getRefrenceNumber() {
		return refrenceNumber;
	}
	public void setRefrenceNumber(String refrenceNumber) {
		this.refrenceNumber = refrenceNumber;
	}
	
	

}
