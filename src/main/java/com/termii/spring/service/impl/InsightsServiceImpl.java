package com.termii.spring.service.impl;

import com.termii.spring.configuration.TermiiProperties;
import com.termii.spring.dto.response.insights.*;
import com.termii.spring.mapper.insights.response.HistoryResponseItemMapper;
import com.termii.spring.mapper.insights.response.HistoryResponseMapper;
import com.termii.spring.mapper.insights.response.SearchResponseMapper;
import com.termii.spring.service.BaseInitializer;
import com.termii.spring.service.InsightsService;
import com.termii.spring.url.InsightsUrlManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.web.util.UriComponentsBuilder;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class InsightsServiceImpl extends BaseInitializer implements InsightsService {

    public static final String API_KEY = "api_key";
    public static final String PHONE_NUMBER = "phone_number";
    private static final String COUNTRY_CODE = "country_code";
    @Autowired private TermiiProperties termiiProperties;

    @Override
    public boolean verifySignature(String payload, String signature) {

        try {

            Mac hmacSHA512 = Mac.getInstance("HmacSHA512");
            SecretKeySpec secretKeySpec = new SecretKeySpec(termiiProperties.getApiKey().getBytes(), "HmacSHA512");
            hmacSHA512.init(secretKeySpec);
            byte[] calculatedSignature = hmacSHA512.doFinal(payload.getBytes());
            String base64EncodedSignature = Base64.getEncoder().encodeToString(calculatedSignature);
            return base64EncodedSignature.equals(signature);

        } catch (InvalidKeyException | NoSuchAlgorithmException e) {

            System.err.println(e.getMessage());
            return false;
        }
    }

    @Override
    public BalanceResponse balance() {

        try {

            HttpHeaders headers = new HttpHeaders();
            headers.set("Content-Type", "application/json");
            String url = UriComponentsBuilder.fromUriString(InsightsUrlManager.BALANCE_URL)
                    .queryParam(API_KEY, termiiProperties.getApiKey()).toUriString();

            HttpEntity<String> httpEntity = new HttpEntity<>(headers);
            return getRestTemplate().exchange(url, HttpMethod.GET, httpEntity, BalanceResponse.class).getBody();

        } catch (Exception exception) {

            System.err.println("error calling termii API");
            throw new RuntimeException(exception.getMessage());
        }
    }

    @Override
    public SearchResponse search(String phoneNumber) {

        try {

            HttpHeaders headers = new HttpHeaders();
            headers.set("Content-Type", "application/json");
            String url = UriComponentsBuilder.fromUriString(InsightsUrlManager.SEARCH_URL)
                    .queryParam(API_KEY, termiiProperties.getApiKey())
                    .queryParam(PHONE_NUMBER, phoneNumber)
                    .toUriString();

            HttpEntity<String> httpEntity = new HttpEntity<>(headers);
            SearchResponseDto responseDto = getRestTemplate().exchange(url, HttpMethod.GET, httpEntity, SearchResponseDto.class).getBody();
            return SearchResponseMapper.fromDto(Objects.requireNonNull(responseDto));

        } catch (Exception exception) {

            System.err.println("error calling termii API");
            throw new RuntimeException(exception.getMessage());
        }
    }

    @Override
    public StatusResponse status(String phoneNumber, String countryCode) {

        try {

            HttpHeaders headers = new HttpHeaders();
            headers.set("Content-Type", "application/json");
            String url = UriComponentsBuilder.fromUriString(InsightsUrlManager.STATUS_URL)
                    .queryParam(PHONE_NUMBER, phoneNumber)
                    .queryParam(API_KEY, termiiProperties.getApiKey())
                    .queryParam(COUNTRY_CODE, countryCode)
                    .toUriString();

            HttpEntity<String> httpEntity = new HttpEntity<>(headers);
            return getRestTemplate().exchange(url, HttpMethod.GET, httpEntity, StatusResponse.class).getBody();

        } catch (Exception exception) {

            System.err.println("error calling termii API");
            throw new RuntimeException(exception.getMessage());
        }
    }

    @Override
    public List<HistoryResponseItemDto> history() {

        try {

            HttpHeaders headers = new HttpHeaders();
            headers.set("Content-Type", "application/json");
            String url = UriComponentsBuilder.fromUriString(InsightsUrlManager.HISTORY_URL)
                    .queryParam(API_KEY, termiiProperties.getApiKey()).toUriString();

            HttpEntity<String> httpEntity = new HttpEntity<>(headers);
            Map<String, Object> response = getRestTemplate().exchange(url, HttpMethod.GET, httpEntity, Map.class).getBody();
            return (List<HistoryResponseItemDto>) Objects.requireNonNull(response).get("data");

        } catch (Exception exception) {

            System.err.println("error calling termii API");
            throw new RuntimeException(exception.getMessage());
        }
    }
}
