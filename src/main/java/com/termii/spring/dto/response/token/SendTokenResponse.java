package com.termii.spring.dto.response.token;

public class SendTokenResponse {

	private String smsStatus;
	private String pinId;
	private String to;

	public void setSmsStatus(String smsStatus){
		this.smsStatus = smsStatus;
	}

	public String getSmsStatus(){
		return smsStatus;
	}

	public void setPinId(String pinId){
		this.pinId = pinId;
	}

	public String getPinId(){
		return pinId;
	}

	public void setTo(String to){
		this.to = to;
	}

	public String getTo(){
		return to;
	}
}
