package com.termii.spring.dto.response.messaging;

public class RequestSenderIdResponse{
	private String code;
	private String message;

	public void setCode(String code){
		this.code = code;
	}

	public String getCode(){
		return code;
	}

	public void setMessage(String message){
		this.message = message;
	}

	public String getMessage(){
		return message;
	}
}
