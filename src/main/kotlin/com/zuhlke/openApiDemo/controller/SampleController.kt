package com.zuhlke.openApiDemo.controller

import io.swagger.client.api.MemesApi
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.MediaType
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class SampleController {
    @Autowired
    private lateinit var memesApi: MemesApi

    @GetMapping(value = ["/test"], produces = arrayOf(MediaType.IMAGE_JPEG_VALUE))
    fun test(): ResponseEntity<ByteArray> {
        var result = memesApi.getAnotherMeme(
                "Confused-Gandalf",
                "This is the way to life",
                "This is the way to glory"
        )

        return ResponseEntity.ok(result)
    }
}
