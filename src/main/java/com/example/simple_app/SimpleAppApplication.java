package com.example.simple_app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class SimpleAppApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        // This connects Spring to your external Tomcat
        return application.sources(SimpleAppApplication.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(SimpleAppApplication.class, args);
    }
}