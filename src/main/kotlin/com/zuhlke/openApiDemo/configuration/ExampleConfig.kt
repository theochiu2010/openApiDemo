package com.zuhlke.openApiDemo.configuration

import io.swagger.client.ApiClient
import io.swagger.client.api.AdminsApi
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class ExampleConfig {
    @Bean
    fun apiClient(): ApiClient {
        return ApiClient().setBasePath("www.google.com")
    }

    @Bean
    fun AdminsApi(): AdminsApi {
        return AdminsApi(apiClient())
    }
}