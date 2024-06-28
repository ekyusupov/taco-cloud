package com.example.tacos.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author Ernest Iusupov
 */
@Configuration
public class WebConfig implements WebMvcConfigurer { //declaring a view controller — a controller that
    //does nothing but forward the request to a view
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("home");
    }
}
