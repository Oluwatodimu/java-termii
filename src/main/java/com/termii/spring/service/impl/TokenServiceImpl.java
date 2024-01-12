package com.termii.spring.service.impl;

import com.termii.spring.configuration.TermiiProperties;
import com.termii.spring.dto.request.token.*;
import com.termii.spring.dto.response.token.*;
import com.termii.spring.mapper.token.request.*;
import com.termii.spring.mapper.token.response.EmailTokenResponseMapper;
import com.termii.spring.mapper.token.response.InAppTokenResponseMapper;
import com.termii.spring.mapper.token.response.VoiceCallResponseMapper;
import com.termii.spring.mapper.token.response.VoiceTokenResponseMapper;
import com.termii.spring.service.BaseInitializer;
import com.termii.spring.service.TokenService;
import com.termii.spring.url.TokenUrlManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;

import java.util.Objects;

public class TokenServiceImpl extends BaseInitializer implements TokenService {

    @Autowired private TermiiProperties termiiProperties;

    @Override
    public SendTokenResponse sendToken(SendTokenRequest tokenRequest) {

        try {

            HttpHeaders headers = new HttpHeaders();
            headers.set("Content-Type", "application/json");
            tokenRequest.setApiKey(termiiProperties.getApiKey());
            SendTokenRequestDto tokenRequestDto = SendTokenRequestMapper.toDto(tokenRequest);
            HttpEntity<SendTokenRequestDto> requestHttpEntity = new HttpEntity<>(tokenRequestDto, headers);
            return getRestTemplate().postForObject(TokenUrlManager.SEND_TOKEN_URL, requestHttpEntity, SendTokenResponse.class);

        } catch (Exception exception) {
            System.err.println("error calling termii API");
            throw new RuntimeException(exception.getMessage());
        }
    }

    @Override
    public VoiceTokenResponse voiceToken(VoiceTokenRequest voiceTokenRequest) {

        try {

            HttpHeaders headers = new HttpHeaders();
            headers.set("Content-Type", "application/json");
            voiceTokenRequest.setApiKey(termiiProperties.getApiKey());
            VoiceTokenRequestDto tokenRequestDto = VoiceTokenRequestMapper.toDto(voiceTokenRequest);
            HttpEntity<VoiceTokenRequestDto> requestHttpEntity = new HttpEntity<>(tokenRequestDto, headers);
            VoiceTokenResponseDto responseDto = getRestTemplate().postForObject(TokenUrlManager.VOICE_TOKEN_URL, requestHttpEntity, VoiceTokenResponseDto.class);
            return VoiceTokenResponseMapper.fromDto(Objects.requireNonNull(responseDto));

        } catch (Exception exception) {
            System.err.println("error calling termii API");
            throw new RuntimeException(exception.getMessage());
        }
    }

    @Override
    public VoiceCallResponse voiceCall(VoiceCallRequest voiceCallRequest) {

        try {

            HttpHeaders headers = new HttpHeaders();
            headers.set("Content-Type", "application/json");
            voiceCallRequest.setApiKey(termiiProperties.getApiKey());
            VoiceCallRequestDto requestDto = VoiceCallRequestMapper.toDto(voiceCallRequest);
            HttpEntity<VoiceCallRequestDto> requestHttpEntity = new HttpEntity<>(requestDto, headers);
            VoiceCallResponseDto responseDto = getRestTemplate().postForObject(TokenUrlManager.VOICE_CALL_URL, requestHttpEntity, VoiceCallResponseDto.class);
            return VoiceCallResponseMapper.fromDto(Objects.requireNonNull(responseDto));

        } catch (Exception exception) {
            System.err.println("error calling termii API");
            throw new RuntimeException(exception.getMessage());
        }
    }

    @Override
    public EmailTokenResponse emailToken(EmailTokenRequest emailTokenRequest) {

        try {

            HttpHeaders headers = new HttpHeaders();
            headers.set("Content-Type", "application/json");
            emailTokenRequest.setApiKey(termiiProperties.getApiKey());
            emailTokenRequest.setEmailConfigurationId(termiiProperties.getEmailConfigurationId());
            EmailTokenRequestDto requestDto = EmailTokenRequestMapper.toDto(emailTokenRequest);
            HttpEntity<EmailTokenRequestDto> requestDtoHttpEntity = new HttpEntity<>(requestDto, headers);
            EmailTokenResponseDto responseDto = getRestTemplate().postForObject(TokenUrlManager.EMAIL_TOKEN_URL, requestDtoHttpEntity, EmailTokenResponseDto.class);
            return EmailTokenResponseMapper.fromDto(Objects.requireNonNull(responseDto));

        } catch (Exception exception) {
            System.err.println("error calling termii API");
            throw new RuntimeException(exception.getMessage());
        }
    }

    @Override
    public VerifyTokenResponse verifyToken(VerifyTokenRequest verifyTokenRequest) {

        try {

            HttpHeaders headers = new HttpHeaders();
            headers.set("Content-Type", "application/json");
            verifyTokenRequest.setApiKey(termiiProperties.getApiKey());
            VerityTokenRequestDto requestDto = VerifyTokenRequestMapper.toDto(verifyTokenRequest);
            HttpEntity<VerityTokenRequestDto> requestDtoHttpEntity = new HttpEntity<>(requestDto, headers);
            return getRestTemplate().postForObject(TokenUrlManager.VERIFY_TOKEN_URL, requestDtoHttpEntity, VerifyTokenResponse.class);

        } catch (Exception exception) {
            System.err.println("error calling termii API");
            throw new RuntimeException(exception.getMessage());
        }
    }

    @Override
    public InAppTokenResponse inAppToken(InAppTokenRequest inAppTokenRequest) {

        try {

            HttpHeaders headers = new HttpHeaders();
            headers.set("Content-Type", "application/json");
            inAppTokenRequest.setApiKey(termiiProperties.getApiKey());
            InAppTokenRequestDto requestDto = InAppTokenRequestMapper.toDto(inAppTokenRequest);
            HttpEntity<InAppTokenRequestDto> requestDtoHttpEntity = new HttpEntity<>(requestDto, headers);
            InAppTokenResponseDto responseDto = getRestTemplate().postForObject(TokenUrlManager.IN_APP_TOKEN_URL, requestDtoHttpEntity, InAppTokenResponseDto.class);
            return InAppTokenResponseMapper.fromDto(Objects.requireNonNull(responseDto));

        } catch (Exception exception) {
            System.err.println("error calling termii API");
            throw new RuntimeException(exception.getMessage());
        }
    }
}
