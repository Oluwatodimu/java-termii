package com.termii.spring.mapper.messaging;

import com.termii.spring.dto.request.messaging.SendMessageToPhoneRequest;
import com.termii.spring.dto.request.messaging.SendMessageToPhoneRequestDto;

public class SendMessageToPhoneMapper {

    public static SendMessageToPhoneRequestDto toDto(SendMessageToPhoneRequest request) {
        SendMessageToPhoneRequestDto requestDto = new SendMessageToPhoneRequestDto();
        requestDto.setTo(request.getTo());
        requestDto.setSms(request.getSms());
        return requestDto;
    }
}
