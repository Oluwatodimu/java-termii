package com.termii.spring.dto.response.messaging;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class FetchSenderIdResponse {

	@JsonProperty("first_page_url")
	private String firstPageUrl;
	private String path;

	@JsonProperty("per_page")
	private int perPage;
	private int total;
	private List<Data> data;

	@JsonProperty("last_page")
	private int lastPage;

	@JsonProperty("last_page_url")
	private String lastPageUrl;

	@JsonProperty("next_page_url")
	private Object nextPageUrl;
	private int from;
	private int to;

	@JsonProperty("prev_page_url")
	private Object prevPageUrl;

	@JsonProperty("current_page")
	private int currentPage;

	public void setFirstPageUrl(String firstPageUrl){
		this.firstPageUrl = firstPageUrl;
	}

	public String getFirstPageUrl(){
		return firstPageUrl;
	}

	public void setPath(String path){
		this.path = path;
	}

	public String getPath(){
		return path;
	}

	public void setPerPage(int perPage){
		this.perPage = perPage;
	}

	public int getPerPage(){
		return perPage;
	}

	public void setTotal(int total){
		this.total = total;
	}

	public int getTotal(){
		return total;
	}

	public void setData(List<Data> data){
		this.data = data;
	}

	public List<Data> getData(){
		return data;
	}

	public void setLastPage(int lastPage){
		this.lastPage = lastPage;
	}

	public int getLastPage(){
		return lastPage;
	}

	public void setLastPageUrl(String lastPageUrl){
		this.lastPageUrl = lastPageUrl;
	}

	public String getLastPageUrl(){
		return lastPageUrl;
	}

	public void setNextPageUrl(Object nextPageUrl){
		this.nextPageUrl = nextPageUrl;
	}

	public Object getNextPageUrl(){
		return nextPageUrl;
	}

	public void setFrom(int from){
		this.from = from;
	}

	public int getFrom(){
		return from;
	}

	public void setTo(int to){
		this.to = to;
	}

	public int getTo(){
		return to;
	}

	public void setPrevPageUrl(Object prevPageUrl){
		this.prevPageUrl = prevPageUrl;
	}

	public Object getPrevPageUrl(){
		return prevPageUrl;
	}

	public void setCurrentPage(int currentPage){
		this.currentPage = currentPage;
	}

	public int getCurrentPage(){
		return currentPage;
	}
}