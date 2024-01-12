package com.termii.spring.dto.request.token;

public class VerifyTokenRequest {

	private String pin;
	private String apiKey;
	private String pinId;

	public void setPin(String pin){
		this.pin = pin;
	}

	public String getPin(){
		return pin;
	}

	public void setApiKey(String apiKey){
		this.apiKey = apiKey;
	}

	public String getApiKey(){
		return apiKey;
	}

	public void setPinId(String pinId){
		this.pinId = pinId;
	}

	public String getPinId(){
		return pinId;
	}
}
