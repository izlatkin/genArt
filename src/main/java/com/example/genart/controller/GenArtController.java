package com.example.genart.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GenArtController {

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello, GenArt!";
    }
}