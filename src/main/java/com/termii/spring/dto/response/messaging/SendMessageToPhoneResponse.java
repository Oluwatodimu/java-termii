package com.termii.spring.dto.response.messaging;

public class SendMessageToPhoneResponse{
	private String code;
	private int balance;
	private String messageId;
	private String message;
	private String user;

	public void setCode(String code){
		this.code = code;
	}

	public String getCode(){
		return code;
	}

	public void setBalance(int balance){
		this.balance = balance;
	}

	public int getBalance(){
		return balance;
	}

	public void setMessageId(String messageId){
		this.messageId = messageId;
	}

	public String getMessageId(){
		return messageId;
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
