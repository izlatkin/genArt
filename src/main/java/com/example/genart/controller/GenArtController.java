package com.example.genart.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.Instant;

@RestController
public class GenArtController {
    private final Instant startTime;
    private final String version;

    public GenArtController(@Value("${application.version:unknown}") String version) {
        this.startTime = Instant.now();
        this.version = version;
    }

    @GetMapping("/info")
    public String getApplicationInfo() {
        return String.format("Application started at: %s, Version: %s", startTime, version);
    }

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello, GenArt!";
    }
}