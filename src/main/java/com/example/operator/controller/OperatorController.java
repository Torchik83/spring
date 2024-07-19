package com.example.operator.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/v2/app")
public class OperatorController {

    @GetMapping
    public Map<String, String> getAppInfo() {
        Map<String, String> response = new HashMap<>();
        response.put("name", "operator");
        response.put("version", "1.44.539");
        return response;
    }
}