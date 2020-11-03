package com.zuhlke.openApiDemo.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class SampleController {
    @GetMapping("/test")
    fun test(): String {
        return "this is maven working project"
    }
}