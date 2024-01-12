package com.termii.spring.mapper.token.request;

import com.termii.spring.dto.request.token.InAppTokenRequest;
import com.termii.spring.dto.request.token.InAppTokenRequestDto;

public class InAppTokenRequestMapper {

    public static InAppTokenRequestDto toDto(InAppTokenRequest inAppTokenRequest) {
        InAppTokenRequestDto inAppTokenRequestDto = new InAppTokenRequestDto();
        inAppTokenRequestDto.setApiKey(inAppTokenRequest.getApiKey());
        inAppTokenRequestDto.setPinType(inAppTokenRequest.getPinType());
        inAppTokenRequestDto.setPhoneNumber(inAppTokenRequest.getPhoneNumber());
        inAppTokenRequestDto.setPinAttempts(inAppTokenRequest.getPinAttempts());
        inAppTokenRequestDto.setPinTimeToLive(inAppTokenRequest.getPinTimeToLive());
        inAppTokenRequestDto.setPinLength(inAppTokenRequest.getPinLength());
        return inAppTokenRequestDto;
    }
}
