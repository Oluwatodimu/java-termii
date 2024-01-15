package com.termii.spring.mapper.messaging;

import com.termii.spring.dto.request.messaging.SendBulkMessageRequest;
import com.termii.spring.dto.request.messaging.SendBulkMessageRequestDto;

public class SendBulkMessageRequestMapper {

    public static SendBulkMessageRequestDto toDto(SendBulkMessageRequest request) {
        SendBulkMessageRequestDto requestDto = new SendBulkMessageRequestDto();
        requestDto.setSms(request.getSms());
        requestDto.setChannel(request.getChannel());
        requestDto.setFrom(request.getFrom());
        requestDto.setTo(request.getTo());
        requestDto.setType(request.getType());
        return requestDto;
    }
}
