package com.sparta.challenge8282.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HomeController {

    @GetMapping("/")
    fun home(): String {
        return "home-aws"
    }

    @GetMapping("/blue/test")
    fun healthz(): String {
        return "blue test"
    }
}
