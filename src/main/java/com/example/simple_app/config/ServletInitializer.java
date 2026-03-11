package com.example.simple_app.config;

import com.example.simple_app.SimpleAppApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

public class ServletInitializer extends SpringBootServletInitializer {
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        // Points to your main application class
        return application.sources(SimpleAppApplication.class);
    }
}