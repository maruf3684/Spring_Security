package com.example.spring_security.controllers;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestSecurity {
    @GetMapping("/hello")
    public String hello(){
        var u = SecurityContextHolder.getContext().getAuthentication();
        u.getAuthorities();
        return "Hello";
    }
}
