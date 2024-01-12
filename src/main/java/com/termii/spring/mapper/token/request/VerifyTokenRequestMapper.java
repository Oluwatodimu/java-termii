package com.termii.spring.mapper.token.request;

import com.termii.spring.dto.request.token.VerifyTokenRequest;
import com.termii.spring.dto.request.token.VerityTokenRequestDto;

public class VerifyTokenRequestMapper {

    public static VerityTokenRequestDto toDto(VerifyTokenRequest verifyTokenRequest) {
        VerityTokenRequestDto verityTokenRequestDto = new VerityTokenRequestDto();
        verityTokenRequestDto.setPinId(verifyTokenRequest.getPinId());
        verityTokenRequestDto.setApiKey(verifyTokenRequest.getApiKey());
        verityTokenRequestDto.setPin(verifyTokenRequest.getPin());
        return verityTokenRequestDto;
    }
}
