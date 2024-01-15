package com.termii.spring.mapper.messaging;

import com.termii.spring.dto.request.messaging.RequestSenderIdRequest;
import com.termii.spring.dto.request.messaging.RequestSenderIdRequestDto;

public class RequestSenderIdRequestMapper {

    public static RequestSenderIdRequestDto toDto(RequestSenderIdRequest request) {
        RequestSenderIdRequestDto requestDto = new RequestSenderIdRequestDto();
        requestDto.setUsecase(request.getUsecase());
        requestDto.setCompany(request.getCompany());
        requestDto.setSenderId(request.getSenderId());
        return requestDto;
    }
}
