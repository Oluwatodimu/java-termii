package com.termii.spring.dto.request.messaging;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RequestSenderIdRequestDto {

    private String usecase;

    @JsonProperty("api_key")
    private String apiKey;
    private String company;

    @JsonProperty("sender_id")
    private String senderId;

    public void setUsecase(String usecase){
        this.usecase = usecase;
    }

    public String getUsecase(){
        return usecase;
    }

    public void setApiKey(String apiKey){
        this.apiKey = apiKey;
    }

    public String getApiKey(){
        return apiKey;
    }

    public void setCompany(String company){
        this.company = company;
    }

    public String getCompany(){
        return company;
    }

    public void setSenderId(String senderId){
        this.senderId = senderId;
    }

    public String getSenderId(){
        return senderId;
    }
}
