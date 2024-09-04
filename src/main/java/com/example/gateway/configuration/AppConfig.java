package com.example.gateway.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

public class AppConfig {

    @Bean
    public RestTemplate template() {
        return new RestTemplate();
    }
}
