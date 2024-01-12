package com.termii.spring.dto.request.token;

import com.fasterxml.jackson.annotation.JsonProperty;

public class VerityTokenRequestDto {

    private String pin;

    @JsonProperty("api_key")
    private String apiKey;

    @JsonProperty("pin_id")
    private String pinId;

    public void setPin(String pin){
        this.pin = pin;
    }

    public String getPin(){
        return pin;
    }

    public void setApiKey(String apiKey){
        this.apiKey = apiKey;
    }

    public String getApiKey(){
        return apiKey;
    }

    public void setPinId(String pinId){
        this.pinId = pinId;
    }

    public String getPinId(){
        return pinId;
    }
}
