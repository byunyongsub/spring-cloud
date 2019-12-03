package com.example.cloud.config.client.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class SampleController {

    @GetMapping(value = { "/", "/sample" })
    public String sample() {
        return "Hi, Time is " + LocalDateTime.now();
    }
}
