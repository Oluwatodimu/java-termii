package com.termii.spring.dto.response.token;

public class VoiceTokenResponse {

	private String code;
	private Object balance;
	private String messageId;
	private String pinId;
	private String message;
	private String user;

	public void setCode(String code){
		this.code = code;
	}

	public String getCode(){
		return code;
	}

	public void setBalance(Object balance){
		this.balance = balance;
	}

	public Object getBalance(){
		return balance;
	}

	public void setMessageId(String messageId){
		this.messageId = messageId;
	}

	public String getMessageId(){
		return messageId;
	}

	public void setPinId(String pinId){
		this.pinId = pinId;
	}

	public String getPinId(){
		return pinId;
	}

	public void setMessage(String message){
		this.message = message;
	}

	public String getMessage(){
		return message;
	}

	public void setUser(String user){
		this.user = user;
	}

	public String getUser(){
		return user;
	}
}
