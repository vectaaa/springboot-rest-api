package com.example.springbootrestapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    //HTTP Get Request
    //http://localhost:8080/hello-nigeria
    @GetMapping("/hello-nigeria")
    public String helloNigeria(){
        return "Hello Nigeria!";
    }
}
