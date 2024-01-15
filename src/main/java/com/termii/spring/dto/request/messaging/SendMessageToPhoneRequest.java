package com.termii.spring.dto.request.messaging;

public class SendMessageToPhoneRequest {

	private String sms;
	private String to;

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
