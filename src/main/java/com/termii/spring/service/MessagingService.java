package com.termii.spring.service;

import com.termii.spring.dto.request.messaging.*;
import com.termii.spring.dto.response.messaging.*;

public interface MessagingService {

    FetchSenderIdResponse fetchSenderId();

    RequestSenderIdResponse requestSenderId(RequestSenderIdRequest request);

    SendMessageResponse sendMessage(SendMessageRequest request);

    SendBulkMessageResponse sendBulkMessage(SendBulkMessageRequest request);

    SendMessageToPhoneResponse sendMessageToPhone(SendMessageToPhoneRequest request);

    DeviceTemplateResponse deviceTemplateMessage(DeviceTemplateRequest request);
}
