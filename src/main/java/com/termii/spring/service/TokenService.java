package com.termii.spring.service;

import com.termii.spring.dto.request.token.*;
import com.termii.spring.dto.response.token.*;

public interface TokenService {

    SendTokenResponse sendToken(SendTokenRequest tokenRequest);

    VoiceTokenResponse voiceToken(VoiceTokenRequest voiceTokenRequest);

    VoiceCallResponse voiceCall(VoiceCallRequest voiceCallRequest);

    EmailTokenResponse emailToken(EmailTokenRequest emailTokenRequest);

    VerifyTokenResponse verifyToken(VerifyTokenRequest verifyTokenRequest);

    InAppTokenResponse inAppToken(InAppTokenRequest inAppTokenRequest);
}
