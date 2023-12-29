package com.example.userservice.controller

import com.example.userservice.repository.Greeting
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/")
class UserController(
    val greeting: Greeting
) {
    @GetMapping("/health_check")
    fun status(): String = "It's Working in User Service"

    @GetMapping("/welcome")
    fun welcome(): String = greeting.message
}
