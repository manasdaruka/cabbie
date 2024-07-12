package com.manascabbie.cabbie.controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class HealthController {

    @GetMapping("/health")
    public String healthPing()
    {
        return "The application is running";
    }
}
