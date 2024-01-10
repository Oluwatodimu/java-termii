package com.termii.spring.mapper.token.response;

import com.termii.spring.dto.response.token.VoiceCallResponse;
import com.termii.spring.dto.response.token.VoiceCallResponseDto;

public class VoiceCallResponseMapper {

    public static VoiceCallResponse fromDto(VoiceCallResponseDto responseDto) {
        VoiceCallResponse tokenResponse = new VoiceCallResponse();
        tokenResponse.setCode(responseDto.getCode());
        tokenResponse.setMessageId(responseDto.getMessageId());
        tokenResponse.setPinId(responseDto.getPinId());
        tokenResponse.setMessage(responseDto.getMessage());
        tokenResponse.setBalance(responseDto.getBalance());
        tokenResponse.setUser(responseDto.getUser());
        return tokenResponse;
    }
}
