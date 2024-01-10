package com.termii.spring.mapper.token.request;

import com.termii.spring.dto.request.token.VoiceCallRequest;
import com.termii.spring.dto.request.token.VoiceCallRequestDto;

public class VoiceCallRequestMapper {

    public static VoiceCallRequestDto toDto(VoiceCallRequest voiceCallRequest) {
        VoiceCallRequestDto requestDto = new VoiceCallRequestDto();
        requestDto.setCode(voiceCallRequest.getCode());
        requestDto.setApiKey(voiceCallRequest.getApiKey());
        requestDto.setPhoneNumber(voiceCallRequest.getPhoneNumber());
        return requestDto;
    }
}
