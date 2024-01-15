package com.termii.spring.dto.request.messaging;

public class RequestSenderIdRequest {

	private String usecase;
	private String company;
	private String senderId;

	public void setUsecase(String usecase){
		this.usecase = usecase;
	}

	public String getUsecase(){
		return usecase;
	}

	public void setCompany(String company){
		this.company = company;
	}

	public String getCompany(){
		return company;
	}

	public void setSenderId(String senderId){
		this.senderId = senderId;
	}

	public String getSenderId(){
		return senderId;
	}
}
