package com.termii.spring.service.impl;

import com.termii.spring.configuration.TermiiProperties;
import com.termii.spring.dto.request.messaging.*;
import com.termii.spring.dto.response.messaging.*;
import com.termii.spring.mapper.messaging.*;
import com.termii.spring.service.BaseInitializer;
import com.termii.spring.service.MessagingService;
import com.termii.spring.url.MessagingUrlManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.web.util.UriComponentsBuilder;

public class MessagingServiceImpl extends BaseInitializer implements MessagingService {

    public static final String API_KEY = "api_key";

    @Autowired private TermiiProperties termiiProperties;

    @Override
    public FetchSenderIdResponse fetchSenderId() {

        try {

            HttpHeaders headers = new HttpHeaders();
            headers.set("Content-Type", "application/json");
            String url = UriComponentsBuilder.fromUriString(MessagingUrlManager.FETCH_SENDER_ID_URL)
                    .queryParam(API_KEY, termiiProperties.getApiKey()).toUriString();

            HttpEntity<String> httpEntity = new HttpEntity<>(headers);
            return getRestTemplate().exchange(url, HttpMethod.GET, httpEntity, FetchSenderIdResponse.class).getBody();

        } catch (Exception exception) {

            System.err.println("error calling termii API");
            throw new RuntimeException(exception.getMessage());
        }
    }

    @Override
    public RequestSenderIdResponse requestSenderId(RequestSenderIdRequest request) {

        try {

            HttpHeaders headers = new HttpHeaders();
            headers.set("Content-Type", "application/json");
            RequestSenderIdRequestDto requestDto = RequestSenderIdRequestMapper.toDto(request);
            requestDto.setApiKey(termiiProperties.getApiKey());
            HttpEntity<RequestSenderIdRequestDto> httpEntity = new HttpEntity<>(requestDto, headers);
            return getRestTemplate().postForObject(MessagingUrlManager.REQUEST_SENDER_ID_URL, httpEntity, RequestSenderIdResponse.class);

        } catch (Exception exception) {
            System.err.println("error calling termii API");
            throw new RuntimeException(exception.getMessage());
        }
    }

    @Override
    public SendMessageResponse sendMessage(SendMessageRequest request) {

        try {

            HttpHeaders headers = new HttpHeaders();
            headers.set("Content-Type", "application/json");
            SendMessageRequestDto requestDto = SendMessageRequestMapper.toDto(request);
            requestDto.setApiKey(termiiProperties.getApiKey());
            HttpEntity<SendMessageRequestDto> httpEntity = new HttpEntity<>(requestDto, headers);
            return getRestTemplate().postForObject(MessagingUrlManager.SEND_MESSAGE_URL, httpEntity, SendMessageResponse.class);

        } catch (Exception exception) {
            System.err.println("error calling termii API");
            throw new RuntimeException(exception.getMessage());
        }
    }

    @Override
    public SendBulkMessageResponse sendBulkMessage(SendBulkMessageRequest request) {

        try {

            HttpHeaders headers = new HttpHeaders();
            headers.set("Content-Type", "application/json");
            SendBulkMessageRequestDto requestDto = SendBulkMessageRequestMapper.toDto(request);
            requestDto.setApiKey(termiiProperties.getApiKey());
            HttpEntity<SendBulkMessageRequestDto> httpEntity = new HttpEntity<>(requestDto, headers);
            return getRestTemplate().postForObject(MessagingUrlManager.SEND_BULK_MESSAGE_URL, httpEntity, SendBulkMessageResponse.class);

        } catch (Exception exception) {
            System.err.println("error calling termii API");
            throw new RuntimeException(exception.getMessage());
        }
    }

    @Override
    public SendMessageToPhoneResponse sendMessageToPhone(SendMessageToPhoneRequest request) {

        try {

            HttpHeaders headers = new HttpHeaders();
            headers.set("Content-Type", "application/json");
            SendMessageToPhoneRequestDto requestDto = SendMessageToPhoneMapper.toDto(request);
            requestDto.setApiKey(termiiProperties.getApiKey());
            HttpEntity<SendMessageToPhoneRequestDto> httpEntity = new HttpEntity<>(requestDto, headers);
            return getRestTemplate().postForObject(MessagingUrlManager.SEND_MESSAGE_VIA_NUMBER_URL, httpEntity, SendMessageToPhoneResponse.class);

        } catch (Exception exception) {
            System.err.println("error calling termii API");
            throw new RuntimeException(exception.getMessage());
        }
    }

    @Override
    public DeviceTemplateResponse deviceTemplateMessage(DeviceTemplateRequest request) {

        try {

            HttpHeaders headers = new HttpHeaders();
            headers.set("Content-Type", "application/json");
            DeviceTemplateRequestDto requestDto = DeviceTemplateRequestMapper.toDto(request);
            requestDto.setApiKey(termiiProperties.getApiKey());
            HttpEntity<DeviceTemplateRequestDto> httpEntity = new HttpEntity<>(requestDto, headers);
            return getRestTemplate().postForObject(MessagingUrlManager.DEVICE_TEMPLATE_URL, httpEntity, DeviceTemplateResponse.class);

        } catch (Exception exception) {
            System.err.println("error calling termii API");
            throw new RuntimeException(exception.getMessage());
        }
    }
}
