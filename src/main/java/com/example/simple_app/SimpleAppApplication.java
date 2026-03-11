package com.example.simple_app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.support.ErrorPageFilter;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SimpleAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(SimpleAppApplication.class, args);
    }

    // REMOVE the public ErrorPageFilter errorPageFilter() method entirely.
    
    // Only keep this registration part:
    @Bean
    public FilterRegistrationBean<ErrorPageFilter> disableSpringBootErrorFilter() {
        ErrorPageFilter filter = new ErrorPageFilter();
        FilterRegistrationBean<ErrorPageFilter> filterRegistrationBean = new FilterRegistrationBean<>(filter);
        filterRegistrationBean.setEnabled(false);
        return filterRegistrationBean;
    }
}