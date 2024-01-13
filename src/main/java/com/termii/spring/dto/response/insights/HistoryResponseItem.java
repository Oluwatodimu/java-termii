package com.termii.spring.dto.response.insights;

public class HistoryResponseItem {

	private int amount;
	private String receiver;
	private String createdAt;
	private String messageId;
	private String message;
	private int reroute;
	private Object notifyUrl;
	private String sendBy;
	private Object mediaUrl;
	private Object notifyId;
	private String sender;
	private String smsType;
	private String status;

	public void setAmount(int amount){
		this.amount = amount;
	}

	public int getAmount(){
		return amount;
	}

	public void setReceiver(String receiver){
		this.receiver = receiver;
	}

	public String getReceiver(){
		return receiver;
	}

	public void setCreatedAt(String createdAt){
		this.createdAt = createdAt;
	}

	public String getCreatedAt(){
		return createdAt;
	}

	public void setMessageId(String messageId){
		this.messageId = messageId;
	}

	public String getMessageId(){
		return messageId;
	}

	public void setMessage(String message){
		this.message = message;
	}

	public String getMessage(){
		return message;
	}

	public void setReroute(int reroute){
		this.reroute = reroute;
	}

	public int getReroute(){
		return reroute;
	}

	public void setNotifyUrl(Object notifyUrl){
		this.notifyUrl = notifyUrl;
	}

	public Object getNotifyUrl(){
		return notifyUrl;
	}

	public void setSendBy(String sendBy){
		this.sendBy = sendBy;
	}

	public String getSendBy(){
		return sendBy;
	}

	public void setMediaUrl(Object mediaUrl){
		this.mediaUrl = mediaUrl;
	}

	public Object getMediaUrl(){
		return mediaUrl;
	}

	public void setNotifyId(Object notifyId){
		this.notifyId = notifyId;
	}

	public Object getNotifyId(){
		return notifyId;
	}

	public void setSender(String sender){
		this.sender = sender;
	}

	public String getSender(){
		return sender;
	}

	public void setSmsType(String smsType){
		this.smsType = smsType;
	}

	public String getSmsType(){
		return smsType;
	}

	public void setStatus(String status){
		this.status = status;
	}

	public String getStatus(){
		return status;
	}
}
