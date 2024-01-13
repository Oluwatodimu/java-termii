package com.termii.spring.dto.response.insights;

public class RouteDetail{
	private int ported;
	private String number;

	public void setPorted(int ported){
		this.ported = ported;
	}

	public int getPorted(){
		return ported;
	}

	public void setNumber(String number){
		this.number = number;
	}

	public String getNumber(){
		return number;
	}
}
