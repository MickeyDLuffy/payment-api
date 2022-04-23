package com.github.mickeydeeluffy.paymentapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api")
public class TestController {

    @GetMapping("/a")
    public Map<String, String> getStrings() {
        return Map.of("Mickey", "Dluffy");
    }
}
