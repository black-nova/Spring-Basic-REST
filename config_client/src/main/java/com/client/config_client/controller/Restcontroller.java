package com.client.config_client.controller;

import org.springframework.web.bind.annotation.RestController;

import com.client.config_client.configuration.config;
import com.client.config_client.model.limit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class Restcontroller {

    @Autowired
    private config configuration;

    @GetMapping("/")
    public limit getMethodName() {
        return new limit(configuration.getminimum(),configuration.getmaximum());
    }
    
}
