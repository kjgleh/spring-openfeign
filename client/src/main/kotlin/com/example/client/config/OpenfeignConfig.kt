package com.example.client.config

import feign.Logger
import org.springframework.cloud.openfeign.EnableFeignClients
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
@EnableFeignClients(basePackages = ["com.example.client"])
class OpenfeignConfig {

//    @Bean
//    fun loggerLevel(): Logger.Level {
//        return Logger.Level.FULL
//    }
}