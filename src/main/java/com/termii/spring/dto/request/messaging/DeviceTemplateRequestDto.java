package com.termii.spring.dto.request.messaging;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DeviceTemplateRequestDto {

	@JsonProperty("device_id")
	private String deviceId;
	private Data data;

	@JsonProperty("api_key")
	private String apiKey;

	@JsonProperty("phone_number")
	private String phoneNumber;

	@JsonProperty("template_id")
	private String templateId;

	public void setDeviceId(String deviceId){
		this.deviceId = deviceId;
	}

	public String getDeviceId(){
		return deviceId;
	}

	public void setData(Data data){
		this.data = data;
	}

	public Data getData(){
		return data;
	}

	public void setApiKey(String apiKey){
		this.apiKey = apiKey;
	}

	public String getApiKey(){
		return apiKey;
	}

	public void setPhoneNumber(String phoneNumber){
		this.phoneNumber = phoneNumber;
	}

	public String getPhoneNumber(){
		return phoneNumber;
	}

	public void setTemplateId(String templateId){
		this.templateId = templateId;
	}

	public String getTemplateId(){
		return templateId;
	}
}
