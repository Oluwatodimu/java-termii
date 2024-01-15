package com.termii.spring.mapper.messaging;

import com.termii.spring.dto.request.messaging.DeviceTemplateRequest;
import com.termii.spring.dto.request.messaging.DeviceTemplateRequestDto;

public class DeviceTemplateRequestMapper {

    public static DeviceTemplateRequestDto toDto(DeviceTemplateRequest request) {
        DeviceTemplateRequestDto requestDto = new DeviceTemplateRequestDto();
        requestDto.setPhoneNumber(request.getPhoneNumber());
        requestDto.setDeviceId(request.getDeviceId());
        requestDto.setTemplateId(request.getTemplateId());
        requestDto.setData(request.getData());
        return requestDto;
    }
}
