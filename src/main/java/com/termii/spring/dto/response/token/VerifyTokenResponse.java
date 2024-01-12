package com.termii.spring.dto.response.token;

public class VerifyTokenResponse {

	private String verified;
	private String pinId;
	private String msisdn;

	public void setVerified(String verified){
		this.verified = verified;
	}

	public String getVerified(){
		return verified;
	}

	public void setPinId(String pinId){
		this.pinId = pinId;
	}

	public String getPinId(){
		return pinId;
	}

	public void setMsisdn(String msisdn){
		this.msisdn = msisdn;
	}

	public String getMsisdn(){
		return msisdn;
	}
}
