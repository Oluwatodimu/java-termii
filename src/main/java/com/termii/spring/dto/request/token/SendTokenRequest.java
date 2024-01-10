package com.termii.spring.dto.request.token;

import com.termii.spring.enums.MessageType;

public class SendTokenRequest {

	private int pinAttempts;
	private int pinLength;
	private String messageText;
	private String apiKey;
	private String channel;
	private MessageType messageType;
	private String from;
	private String to;
	private int pinTimeToLive;
	private String pinPlaceholder;

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

	public void setMessageText(String messageText){
		this.messageText = messageText;
	}

	public String getMessageText(){
		return messageText;
	}

	public void setApiKey(String apiKey){
		this.apiKey = apiKey;
	}

	public String getApiKey(){
		return apiKey;
	}

	public void setChannel(String channel){
		this.channel = channel;
	}

	public String getChannel(){
		return channel;
	}

	public void setMessageType(MessageType messageType){
		this.messageType = messageType;
	}

	public MessageType getMessageType(){
		return messageType;
	}

	public void setFrom(String from){
		this.from = from;
	}

	public String getFrom(){
		return from;
	}

	public void setTo(String to){
		this.to = to;
	}

	public String getTo(){
		return to;
	}

	public void setPinTimeToLive(int pinTimeToLive){
		this.pinTimeToLive = pinTimeToLive;
	}

	public int getPinTimeToLive(){
		return pinTimeToLive;
	}

	public void setPinPlaceholder(String pinPlaceholder){
		this.pinPlaceholder = pinPlaceholder;
	}

	public String getPinPlaceholder(){
		return pinPlaceholder;
	}
}
