package com.termii.spring.mapper.token.request;

import com.termii.spring.dto.request.token.VoiceTokenRequest;
import com.termii.spring.dto.request.token.VoiceTokenRequestDto;

public class VoiceTokenRequestMapper {

    public static VoiceTokenRequestDto toDto(VoiceTokenRequest tokenRequest) {
        VoiceTokenRequestDto requestDto = new VoiceTokenRequestDto();
        requestDto.setPinAttempts(tokenRequest.getPinAttempts());
        requestDto.setPinLength(tokenRequest.getPinLength());
        requestDto.setApiKey(tokenRequest.getApiKey());
        requestDto.setPhoneNumber(tokenRequest.getPhoneNumber());
        requestDto.setPinTimeToLive(tokenRequest.getPinTimeToLive());
        return requestDto;
    }
}
