package com.termii.spring.dto.request.token;

import com.fasterxml.jackson.annotation.JsonProperty;

public class VoiceCallRequestDto {

    private int code;

    @JsonProperty("api_key")
    private String apiKey;

    @JsonProperty("phone_number")
    private String phoneNumber;

    public int getCode(){
        return code;
    }

    public String getApiKey(){
        return apiKey;
    }

    public String getPhoneNumber(){
        return phoneNumber;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
