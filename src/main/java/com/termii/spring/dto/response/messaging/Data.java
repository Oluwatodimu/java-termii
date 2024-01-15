package com.termii.spring.dto.response.messaging;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Data {

	private String country;
	private String usecase;

	@JsonProperty("created_at")
	private String createdAt;
	private String company;

	@JsonProperty("sender_id")
	private String senderId;
	private String status;

	public void setCountry(String country){
		this.country = country;
	}

	public String getCountry(){
		return country;
	}

	public void setUsecase(String usecase){
		this.usecase = usecase;
	}

	public String getUsecase(){
		return usecase;
	}

	public void setCreatedAt(String createdAt){
		this.createdAt = createdAt;
	}

	public String getCreatedAt(){
		return createdAt;
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

	public void setStatus(String status){
		this.status = status;
	}

	public String getStatus(){
		return status;
	}
}
