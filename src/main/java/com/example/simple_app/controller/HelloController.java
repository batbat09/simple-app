package com.example.simple_app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String index() {
        return "<html><body style='font-family: sans-serif; text-align: center; margin-top: 50px;'>" +
               "<h1 style='color: #2c3e50;'>CI/CD Pipeline Success!</h1>" +
               "<div style='border: 1px solid #ccc; display: inline-block; padding: 20px; border-radius: 10px;'>" +
               "<p><strong>Source:</strong> GitHub</p>" +
               "<p><strong>Build Tool:</strong> Jenkins</p>" +
               "<p><strong>Server:</strong> Local Tomcat</p>" +
               "</div>" +
               "</body></html>";
    }
}