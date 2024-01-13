package com.termii.spring.configuration;

import com.termii.spring.service.InsightsService;
import com.termii.spring.service.TokenService;
import com.termii.spring.service.impl.InsightsServiceImpl;
import com.termii.spring.service.impl.TokenServiceImpl;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(TermiiProperties.class)
public class ApplicationConfiguration {

    @Bean
    public TokenService tokenService() {
        return new TokenServiceImpl();
    }

    @Bean
    public InsightsService insightsService() {
        return new InsightsServiceImpl();
    }
}
