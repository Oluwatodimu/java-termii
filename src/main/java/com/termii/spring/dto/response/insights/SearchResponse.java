package com.termii.spring.dto.response.insights;

public class SearchResponse {

	private String number;
	private String networkCode;
	private String status;
	private String network;

	public void setNumber(String number){
		this.number = number;
	}

	public String getNumber(){
		return number;
	}

	public void setNetworkCode(String networkCode){
		this.networkCode = networkCode;
	}

	public String getNetworkCode(){
		return networkCode;
	}

	public void setStatus(String status){
		this.status = status;
	}

	public String getStatus(){
		return status;
	}

	public void setNetwork(String network){
		this.network = network;
	}

	public String getNetwork(){
		return network;
	}
}
