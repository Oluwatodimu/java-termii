package com.termii.spring.dto.request.token;

import com.fasterxml.jackson.annotation.JsonProperty;

public class EmailTokenRequestDto {

    @JsonProperty("email_configuration_id")
    private String emailConfigurationId;

    @JsonProperty("email_address")
    private String emailAddress;

    private String code;

    @JsonProperty("api_key")
    private String apiKey;

    public void setEmailConfigurationId(String emailConfigurationId){
        this.emailConfigurationId = emailConfigurationId;
    }

    public String getEmailConfigurationId(){
        return emailConfigurationId;
    }

    public void setEmailAddress(String emailAddress){
        this.emailAddress = emailAddress;
    }

    public String getEmailAddress(){
        return emailAddress;
    }

    public void setCode(String code){
        this.code = code;
    }

    public String getCode(){
        return code;
    }

    public void setApiKey(String apiKey){
        this.apiKey = apiKey;
    }

    public String getApiKey(){
        return apiKey;
    }
}
