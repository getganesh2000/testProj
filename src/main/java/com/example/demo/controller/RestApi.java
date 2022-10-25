package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestApi {

    @GetMapping("/get")
    public String get(){
        return "Hello,,,";
    }
}
