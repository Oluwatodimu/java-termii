package com.termii.spring.dto.response.insights;

import java.util.List;

public class StatusResponse {

	private List<ResultItem> result;

	public void setResult(List<ResultItem> result){
		this.result = result;
	}

	public List<ResultItem> getResult(){
		return result;
	}
}