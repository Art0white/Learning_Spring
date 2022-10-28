package com.lspring.demo.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping ("hello")
    String hello() {
        return "Hello, Spring Security!";
    }
}
