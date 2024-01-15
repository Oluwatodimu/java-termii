package com.termii.spring.dto.request.messaging;

import java.util.List;

public class SendBulkMessageRequest {

	private String sms;
	private String channel;
	private String from;
	private List<String> to;
	private String type;

	public void setSms(String sms){
		this.sms = sms;
	}

	public String getSms(){
		return sms;
	}

	public void setChannel(String channel){
		this.channel = channel;
	}

	public String getChannel(){
		return channel;
	}

	public void setFrom(String from){
		this.from = from;
	}

	public String getFrom(){
		return from;
	}

	public void setTo(List<String> to){
		this.to = to;
	}

	public List<String> getTo(){
		return to;
	}

	public void setType(String type){
		this.type = type;
	}

	public String getType(){
		return type;
	}
}