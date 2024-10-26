package com.spj.multi_version_api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v2")
public class GreetingControllerV2 {
    @GetMapping("/greet")
    public String greet() {
        return "Hello from API version 2!";
    }
}
