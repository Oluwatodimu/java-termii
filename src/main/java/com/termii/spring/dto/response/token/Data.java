package com.termii.spring.dto.response.token;

public class Data {

	private String phoneNumberOther;
	private String otp;
	private String phoneNumber;
	private String pinId;

	public void setPhoneNumberOther(String phoneNumberOther){
		this.phoneNumberOther = phoneNumberOther;
	}

	public String getPhoneNumberOther(){
		return phoneNumberOther;
	}

	public void setOtp(String otp){
		this.otp = otp;
	}

	public String getOtp(){
		return otp;
	}

	public void setPhoneNumber(String phoneNumber){
		this.phoneNumber = phoneNumber;
	}

	public String getPhoneNumber(){
		return phoneNumber;
	}

	public void setPinId(String pinId){
		this.pinId = pinId;
	}

	public String getPinId(){
		return pinId;
	}
}
