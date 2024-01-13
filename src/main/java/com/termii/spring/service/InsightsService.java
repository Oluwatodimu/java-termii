package com.termii.spring.service;

import com.termii.spring.dto.response.insights.*;

import java.util.List;

public interface InsightsService {

    boolean verifySignature(String payload, String signature);

    BalanceResponse balance();

    SearchResponse search(String phoneNumber);

    StatusResponse status(String phoneNumber, String countryCode);

    List<HistoryResponseItemDto> history();
}
