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

    // Add this to prevent the "Possibly already registered?" error
    @Bean
    public ErrorPageFilter errorPageFilter() {
        return new ErrorPageFilter();
    }

    @Bean
    public FilterRegistrationBean<ErrorPageFilter> disableSpringBootErrorFilter(ErrorPageFilter filter) {
        FilterRegistrationBean<ErrorPageFilter> filterRegistrationBean = new FilterRegistrationBean<>(filter);
        filterRegistrationBean.setEnabled(false);
        return filterRegistrationBean;
    }
}