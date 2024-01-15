package com.termii.spring.dto.request.messaging;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SendMessageToPhoneRequestDto {

	@JsonProperty("api_key")
	private String apiKey;
	private String sms;
	private String to;

	public void setApiKey(String apiKey){
		this.apiKey = apiKey;
	}

	public String getApiKey(){
		return apiKey;
	}

	public void setSms(String sms){
		this.sms = sms;
	}

	public String getSms(){
		return sms;
	}

	public void setTo(String to){
		this.to = to;
	}

	public String getTo(){
		return to;
	}
}
