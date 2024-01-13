package com.termii.spring.dto.response.insights;

public class ResultItem {

	private CountryDetail countryDetail;
	private RouteDetail routeDetail;
	private OperatorDetail operatorDetail;
	private int status;

	public void setCountryDetail(CountryDetail countryDetail){
		this.countryDetail = countryDetail;
	}

	public CountryDetail getCountryDetail(){
		return countryDetail;
	}

	public void setRouteDetail(RouteDetail routeDetail){
		this.routeDetail = routeDetail;
	}

	public RouteDetail getRouteDetail(){
		return routeDetail;
	}

	public void setOperatorDetail(OperatorDetail operatorDetail){
		this.operatorDetail = operatorDetail;
	}

	public OperatorDetail getOperatorDetail(){
		return operatorDetail;
	}

	public void setStatus(int status){
		this.status = status;
	}

	public int getStatus(){
		return status;
	}
}
