package com.termii.spring.dto.request.token;

import com.termii.spring.enums.PinType;

public class InAppTokenRequest {

	private int pinAttempts;
	private int pinLength;
	private String apiKey;
	private String phoneNumber;
	private PinType pinType;
	private int pinTimeToLive;

	public void setPinAttempts(int pinAttempts){
		this.pinAttempts = pinAttempts;
	}

	public int getPinAttempts(){
		return pinAttempts;
	}

	public void setPinLength(int pinLength){
		this.pinLength = pinLength;
	}

	public int getPinLength(){
		return pinLength;
	}

	public void setApiKey(String apiKey){
		this.apiKey = apiKey;
	}

	public String getApiKey(){
		return apiKey;
	}

	public void setPhoneNumber(String phoneNumber){
		this.phoneNumber = phoneNumber;
	}

	public String getPhoneNumber(){
		return phoneNumber;
	}

	public void setPinType(PinType pinType){
		this.pinType = pinType;
	}

	public PinType getPinType(){
		return pinType;
	}

	public void setPinTimeToLive(int pinTimeToLive){
		this.pinTimeToLive = pinTimeToLive;
	}

	public int getPinTimeToLive(){
		return pinTimeToLive;
	}
}
