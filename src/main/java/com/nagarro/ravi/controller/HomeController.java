package com.nagarro.ravi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    
    @GetMapping("/")
    public String sayHello() {
        return "Hello Ravindra Kumar";
    }
}
