package com.imranmadbar;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String testMsg(){
        return "Welcome to Spring Boot and Cassandra DB Project";
    }

}
