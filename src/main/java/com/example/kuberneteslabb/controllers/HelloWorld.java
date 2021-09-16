package com.example.kuberneteslabb.controllers;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {

    @GetMapping("/hello")
    public String getGreeting() {
        return "Hello, World";
    }
}
