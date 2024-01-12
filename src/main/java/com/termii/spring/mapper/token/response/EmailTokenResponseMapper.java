package com.termii.spring.mapper.token.response;

import com.termii.spring.dto.response.token.EmailTokenResponse;
import com.termii.spring.dto.response.token.EmailTokenResponseDto;

public class EmailTokenResponseMapper {

    public static EmailTokenResponse fromDto(EmailTokenResponseDto tokenResponseDto) {
        EmailTokenResponse tokenResponse = new EmailTokenResponse();
        tokenResponse.setCode(tokenResponseDto.getCode());
        tokenResponse.setBalance(tokenResponseDto.getBalance());
        tokenResponse.setMessageId(tokenResponseDto.getMessageId());
        tokenResponse.setMessage(tokenResponseDto.getMessage());
        tokenResponse.setUser(tokenResponseDto.getUser());
        return tokenResponse;
    }
}
