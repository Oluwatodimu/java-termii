package com.termii.spring.dto.response.insights;

public class OperatorDetail{
	private String mobileNumberCode;
	private String lineType;
	private String operatorCode;
	private String mobileRoutingCode;
	private String operatorName;
	private String carrierIdentificationCode;

	public void setMobileNumberCode(String mobileNumberCode){
		this.mobileNumberCode = mobileNumberCode;
	}

	public String getMobileNumberCode(){
		return mobileNumberCode;
	}

	public void setLineType(String lineType){
		this.lineType = lineType;
	}

	public String getLineType(){
		return lineType;
	}

	public void setOperatorCode(String operatorCode){
		this.operatorCode = operatorCode;
	}

	public String getOperatorCode(){
		return operatorCode;
	}

	public void setMobileRoutingCode(String mobileRoutingCode){
		this.mobileRoutingCode = mobileRoutingCode;
	}

	public String getMobileRoutingCode(){
		return mobileRoutingCode;
	}

	public void setOperatorName(String operatorName){
		this.operatorName = operatorName;
	}

	public String getOperatorName(){
		return operatorName;
	}

	public void setCarrierIdentificationCode(String carrierIdentificationCode){
		this.carrierIdentificationCode = carrierIdentificationCode;
	}

	public String getCarrierIdentificationCode(){
		return carrierIdentificationCode;
	}
}
