package com.termii.spring.service;

import com.termii.spring.configuration.TermiiProperties;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.util.StringUtils;
import org.springframework.web.client.RestTemplate;

import java.time.Duration;

public class BaseInitializer {

    private static final int CONNECTION_TIME_OUT = 15;
    private static final int READ_TIME_OUT = 15;

    private RestTemplate restTemplate;

    @Autowired
    private TermiiProperties termiiProperties;

    @Autowired
    private RestTemplateBuilder restTemplateBuilder;


    @PostConstruct
    private void init() {
        if (!StringUtils.hasLength(termiiProperties.getApiKey())) {
            throw new IllegalStateException("Termii API key required");
        }

        if (!StringUtils.hasLength(termiiProperties.getEmailConfigurationId())) {
            throw new IllegalStateException("Termii email config id required");
        }

        restTemplate = restTemplateBuilder
                .setConnectTimeout(Duration.ofSeconds(CONNECTION_TIME_OUT))
                .setReadTimeout(Duration.ofSeconds(READ_TIME_OUT))
                .build();
    }

    public RestTemplate getRestTemplate() {
        return restTemplate;
    }
}
