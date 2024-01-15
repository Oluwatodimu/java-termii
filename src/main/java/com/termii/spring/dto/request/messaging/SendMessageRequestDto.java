package com.termii.spring.dto.request.messaging;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class SendMessageRequestDto {

	@JsonProperty("api_key")
	private String apiKey;
	private String sms;
	private String channel;
	private String from;
	private List<String> to;
	private Media media;
	private String type;

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

	public void setMedia(Media media){
		this.media = media;
	}

	public Media getMedia(){
		return media;
	}

	public void setType(String type){
		this.type = type;
	}

	public String getType(){
		return type;
	}

	public List<String> getTo() {
		return to;
	}

	public void setTo(List<String> to) {
		this.to = to;
	}
}
