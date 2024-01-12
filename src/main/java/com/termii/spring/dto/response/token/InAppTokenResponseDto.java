package com.termii.spring.dto.response.token;

public class InAppTokenResponseDto {

    private DataDto data;
    private String status;

    public void setData(DataDto data){
        this.data = data;
    }

    public DataDto getData(){
        return data;
    }

    public void setStatus(String status){
        this.status = status;
    }

    public String getStatus(){
        return status;
    }
}
