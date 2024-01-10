package com.termii.spring.service;

import com.termii.spring.dto.request.token.SendTokenRequest;
import com.termii.spring.dto.request.token.VoiceCallRequest;
import com.termii.spring.dto.request.token.VoiceTokenRequest;
import com.termii.spring.dto.response.token.SendTokenResponse;
import com.termii.spring.dto.response.token.VoiceCallResponse;
import com.termii.spring.dto.response.token.VoiceTokenResponse;

public interface TokenService {

    SendTokenResponse sendToken(SendTokenRequest tokenRequest);

    VoiceTokenResponse voiceToken(VoiceTokenRequest voiceTokenRequest);

    VoiceCallResponse voiceCall(VoiceCallRequest voiceCallRequest);
}
