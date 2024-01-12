package com.termii.spring.mapper.token.response;

import com.termii.spring.dto.response.token.Data;
import com.termii.spring.dto.response.token.InAppTokenResponse;
import com.termii.spring.dto.response.token.InAppTokenResponseDto;

public class InAppTokenResponseMapper {

    public static InAppTokenResponse fromDto(InAppTokenResponseDto inAppTokenResponseDto) {
        Data data = new Data();
        data.setPinId(inAppTokenResponseDto.getData().getPinId());
        data.setOtp(inAppTokenResponseDto.getData().getOtp());
        data.setPhoneNumber(inAppTokenResponseDto.getData().getPhoneNumber());
        data.setPhoneNumberOther(inAppTokenResponseDto.getData().getPhoneNumberOther());

        InAppTokenResponse inAppTokenResponse = new InAppTokenResponse();
        inAppTokenResponse.setStatus(inAppTokenResponseDto.getStatus());
        inAppTokenResponse.setData(data);
        return inAppTokenResponse;
    }
}
