package com.termii.spring.dto.response.insights;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SearchResponseDto {

    private String number;

    @JsonProperty("network_code")
    private String networkCode;
    private String status;
    private String network;

    public void setNumber(String number){
        this.number = number;
    }

    public String getNumber(){
        return number;
    }

    public void setNetworkCode(String networkCode){
        this.networkCode = networkCode;
    }

    public String getNetworkCode(){
        return networkCode;
    }

    public void setStatus(String status){
        this.status = status;
    }

    public String getStatus(){
        return status;
    }

    public void setNetwork(String network){
        this.network = network;
    }

    public String getNetwork(){
        return network;
    }
}
