package com.termii.spring.mapper.token.request;

import com.termii.spring.dto.request.token.SendTokenRequest;
import com.termii.spring.dto.request.token.SendTokenRequestDto;

public class SendTokenRequestMapper {

    public static SendTokenRequestDto toDto(SendTokenRequest tokenRequest) {
        SendTokenRequestDto tokenRequestDto = new SendTokenRequestDto();
        tokenRequestDto.setPinAttempts(tokenRequest.getPinAttempts());
        tokenRequestDto.setPinLength(tokenRequest.getPinLength());
        tokenRequestDto.setMessageText(tokenRequest.getMessageText());
        tokenRequestDto.setApiKey(tokenRequest.getApiKey());
        tokenRequestDto.setChannel(tokenRequest.getChannel());
        tokenRequestDto.setMessageType(tokenRequest.getMessageType());
        tokenRequestDto.setFrom(tokenRequest.getFrom());
        tokenRequestDto.setTo(tokenRequest.getTo());
        tokenRequestDto.setPinTimeToLive(tokenRequest.getPinTimeToLive());
        tokenRequestDto.setPinPlaceholder(tokenRequest.getPinPlaceholder());
        return tokenRequestDto;
    }

    public static SendTokenRequest fromDto(SendTokenRequestDto tokenRequestDto) {
        SendTokenRequest tokenRequest = new SendTokenRequest();
        tokenRequest.setPinAttempts(tokenRequestDto.getPinAttempts());
        tokenRequest.setPinLength(tokenRequestDto.getPinLength());
        tokenRequest.setMessageText(tokenRequestDto.getMessageText());
        tokenRequest.setApiKey(tokenRequestDto.getApiKey());
        tokenRequest.setChannel(tokenRequestDto.getChannel());
        tokenRequest.setMessageType(tokenRequestDto.getMessageType());
        tokenRequest.setFrom(tokenRequestDto.getFrom());
        tokenRequest.setTo(tokenRequestDto.getTo());
        tokenRequest.setPinTimeToLive(tokenRequestDto.getPinTimeToLive());
        tokenRequest.setPinPlaceholder(tokenRequestDto.getPinPlaceholder());
        return tokenRequest;
    }
}
