package com.termii.spring.mapper.token.response;

import com.termii.spring.dto.response.token.VoiceTokenResponse;
import com.termii.spring.dto.response.token.VoiceTokenResponseDto;

public class VoiceTokenResponseMapper {

    public static VoiceTokenResponse fromDto(VoiceTokenResponseDto responseDto) {
        VoiceTokenResponse tokenResponse = new VoiceTokenResponse();
        tokenResponse.setCode(responseDto.getCode());
        tokenResponse.setMessageId(responseDto.getMessageId());
        tokenResponse.setPinId(responseDto.getPinId());
        tokenResponse.setMessage(responseDto.getMessage());
        tokenResponse.setBalance(responseDto.getBalance());
        tokenResponse.setUser(responseDto.getUser());
        return tokenResponse;
    }
}
