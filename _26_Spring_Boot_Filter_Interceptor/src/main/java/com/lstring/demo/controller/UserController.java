package com.lstring.demo.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
public class UserController {
    @RequestMapping("/{id:\\d+}")
    public void get(@PathVariable String id) {
        System.out.println(id);
    }
}
