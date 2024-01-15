package com.termii.spring.mapper.messaging;

import com.termii.spring.dto.request.messaging.SendMessageRequest;
import com.termii.spring.dto.request.messaging.SendMessageRequestDto;

public class SendMessageRequestMapper {

    public static SendMessageRequestDto toDto(SendMessageRequest request) {
        SendMessageRequestDto requestDto = new SendMessageRequestDto();
        requestDto.setSms(request.getSms());
        requestDto.setChannel(request.getChannel());
        requestDto.setFrom(request.getFrom());
        requestDto.setTo(request.getTo());
        requestDto.setMedia(request.getMedia());
        requestDto.setType(request.getType());
        return requestDto;
    }
}
