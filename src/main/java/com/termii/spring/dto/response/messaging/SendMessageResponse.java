package com.termii.spring.dto.response.messaging;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SendMessageResponse {

	private int balance;

	@JsonProperty("message_id")
	private String messageId;
	private String message;
	private String user;

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
