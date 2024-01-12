package com.termii.spring.mapper.token.request;

import com.termii.spring.dto.request.token.EmailTokenRequest;
import com.termii.spring.dto.request.token.EmailTokenRequestDto;

public class EmailTokenRequestMapper {

    public static EmailTokenRequestDto toDto(EmailTokenRequest emailTokenRequest) {
        EmailTokenRequestDto tokenRequestDto = new EmailTokenRequestDto();
        tokenRequestDto.setEmailConfigurationId(emailTokenRequest.getEmailConfigurationId());
        tokenRequestDto.setEmailAddress(emailTokenRequest.getEmailAddress());
        tokenRequestDto.setCode(emailTokenRequest.getCode());
        tokenRequestDto.setApiKey(emailTokenRequest.getApiKey());
        return tokenRequestDto;
    }
}
