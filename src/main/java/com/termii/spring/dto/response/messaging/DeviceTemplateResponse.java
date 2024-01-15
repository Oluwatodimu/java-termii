package com.termii.spring.dto.response.messaging;

import java.util.List;

public class DeviceTemplateResponse {

	private List<DeviceTemplateResponseItem> deviceTemplateResponse;

	public void setDeviceTemplateResponse(List<DeviceTemplateResponseItem> deviceTemplateResponse){
		this.deviceTemplateResponse = deviceTemplateResponse;
	}

	public List<DeviceTemplateResponseItem> getDeviceTemplateResponse(){
		return deviceTemplateResponse;
	}
}