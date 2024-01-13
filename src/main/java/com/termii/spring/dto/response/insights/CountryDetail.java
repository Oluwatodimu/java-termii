package com.termii.spring.dto.response.insights;

public class CountryDetail {
	private String mobileCountryCode;
	private String iso;
	private String countryCode;

	public void setMobileCountryCode(String mobileCountryCode){
		this.mobileCountryCode = mobileCountryCode;
	}

	public String getMobileCountryCode(){
		return mobileCountryCode;
	}

	public void setIso(String iso){
		this.iso = iso;
	}

	public String getIso(){
		return iso;
	}

	public void setCountryCode(String countryCode){
		this.countryCode = countryCode;
	}

	public String getCountryCode(){
		return countryCode;
	}
}
