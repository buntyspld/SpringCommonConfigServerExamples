package com.saurabh.config.com.saurabh.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GreetingContorller {
    @Value("${app.description : default value}")
    private String greetinMessage;
    @Value("${static.message}")
    private String staticMessage;
    @Value("${my.list.values}")
    private List<String> listOfValues;
    @Autowired
    private Environment environment;

    @GetMapping("/msg")
    public String printAllMessages() {
        return listOfValues.toString();
    }

    @GetMapping("envD")
    public String printEnvDetails() {
        return environment.toString();
    }
}