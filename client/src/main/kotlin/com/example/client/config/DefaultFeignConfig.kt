package com.example.client.config

import feign.Logger
import feign.Request
import java.util.concurrent.TimeUnit
import org.springframework.context.annotation.Bean

class DefaultFeignConfig {

//    @Bean
//    fun loggerLevel(): Logger.Level {
//        return Logger.Level.FULL
//    }

//    @Bean
//    fun options(): Request.Options {
//        val connectTimeout = 1000L
//        val readTimeout = 5000L
//        return Request.Options(connectTimeout, TimeUnit.MILLISECONDS, readTimeout, TimeUnit.MILLISECONDS, false)
//    }
}