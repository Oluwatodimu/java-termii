package com.termii.spring.dto.response.insights;

import java.util.List;

public class HistoryResponse {

	public HistoryResponse() {

	}

	public HistoryResponse(List<HistoryResponseItem> data) {
		this.data = data;
	}

	private List<HistoryResponseItem> data;

	public void setData(List<HistoryResponseItem> data){
		this.data = data;
	}

	public List<HistoryResponseItem> getData(){
		return data;
	}
}