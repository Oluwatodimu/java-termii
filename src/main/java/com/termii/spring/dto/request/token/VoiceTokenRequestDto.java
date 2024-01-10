package com.termii.spring.dto.request.token;

import com.fasterxml.jackson.annotation.JsonProperty;

public class VoiceTokenRequestDto {

    @JsonProperty("pin_attempts")
    private int pinAttempts;

    @JsonProperty("pin_length")
    private int pinLength;

    @JsonProperty("api_key")
    private String apiKey;

    @JsonProperty("phone_number")
    private String phoneNumber;

    @JsonProperty("pin_time_to_live")
    private int pinTimeToLive;

    public void setPinAttempts(int pinAttempts){
        this.pinAttempts = pinAttempts;
    }

    public int getPinAttempts(){
        return pinAttempts;
    }

    public void setPinLength(int pinLength){
        this.pinLength = pinLength;
    }

    public int getPinLength(){
        return pinLength;
    }

    public void setApiKey(String apiKey){
        this.apiKey = apiKey;
    }

    public String getApiKey(){
        return apiKey;
    }

    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber(){
        return phoneNumber;
    }

    public void setPinTimeToLive(int pinTimeToLive){
        this.pinTimeToLive = pinTimeToLive;
    }

    public int getPinTimeToLive(){
        return pinTimeToLive;
    }
}
