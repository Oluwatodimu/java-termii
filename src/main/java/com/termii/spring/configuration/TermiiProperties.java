package com.termii.spring.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "termii")
public class TermiiProperties {

    private String apiKey;

    private String apiSecret;

    private String emailConfigurationId;

    public String getApiKey() {
        return apiKey;
    }

    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }

    public String getEmailConfigurationId() {
        return emailConfigurationId;
    }

    public void setEmailConfigurationId(String emailConfigurationId) {
        this.emailConfigurationId = emailConfigurationId;
    }

    public String getApiSecret() {
        return apiSecret;
    }

    public void setApiSecret(String apiSecret) {
        this.apiSecret = apiSecret;
    }
}
