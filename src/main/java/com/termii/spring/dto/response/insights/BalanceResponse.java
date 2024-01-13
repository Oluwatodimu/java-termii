package com.termii.spring.dto.response.insights;

public class BalanceResponse {

	private int balance;
	private String currency;
	private String user;

	public void setBalance(int balance){
		this.balance = balance;
	}

	public int getBalance(){
		return balance;
	}

	public void setCurrency(String currency){
		this.currency = currency;
	}

	public String getCurrency(){
		return currency;
	}

	public void setUser(String user){
		this.user = user;
	}

	public String getUser(){
		return user;
	}
}
