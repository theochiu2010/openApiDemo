package com.zuhlke.openApiDemo.configuration

import io.swagger.client.ApiClient
import io.swagger.client.api.MemesApi
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class ExampleConfig {
    @Bean
    fun apiClient(): ApiClient {
        return ApiClient().setBasePath("http://apimeme.com")
    }

    @Bean
    fun memesApi(): MemesApi {
        return MemesApi(apiClient())
    }
}
