package com.example.client.config

import feign.Logger
import org.springframework.context.annotation.Bean

class DefaultFeignConfig {

    @Bean
    fun loggerLevel(): Logger.Level {
        return Logger.Level.FULL
    }
}