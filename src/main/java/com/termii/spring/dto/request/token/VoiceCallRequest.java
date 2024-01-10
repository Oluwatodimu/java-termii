package com.termii.spring.dto.request.token;

public class VoiceCallRequest {

	private int code;
	private String apiKey;
	private String phoneNumber;

	public int getCode(){
		return code;
	}

	public String getApiKey(){
		return apiKey;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public void setApiKey(String apiKey) {
		this.apiKey = apiKey;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getPhoneNumber(){
		return phoneNumber;
	}
}
