package com.zuhlke.openApiDemo.controller

import io.swagger.client.api.AdminsApi
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class SampleController {
    @Autowired
    private lateinit var adminsApi: AdminsApi

    @GetMapping("/test")
    fun test(): String {
        adminsApi.addInventory(null)

        return "this is maven working project"
    }
}