package com.eabp.marketpractice.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class GreetingController {
    @GetMapping("/")
    public String greeting () {
        return "Aloja World 🚀";
    }
}
