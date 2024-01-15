package com.termii.spring.dto.request.messaging;

public class Data{
	private int otp;
	private String expiryTime;
	private String productName;

	public void setOtp(int otp){
		this.otp = otp;
	}

	public int getOtp(){
		return otp;
	}

	public void setExpiryTime(String expiryTime){
		this.expiryTime = expiryTime;
	}

	public String getExpiryTime(){
		return expiryTime;
	}

	public void setProductName(String productName){
		this.productName = productName;
	}

	public String getProductName(){
		return productName;
	}
}
