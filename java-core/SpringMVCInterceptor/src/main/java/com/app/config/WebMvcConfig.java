package com.app.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.app.interceptor.AdminInterceptor;
import com.app.interceptor.LogInterceptor;
import com.app.interceptor.OldLoginInterceptor;


@Configuration
@EnableWebMvc
public class WebMvcConfig extends WebMvcConfigurerAdapter {
 
    // Static Resource Config
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
 
    }
 
    @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
        configurer.enable();
    }
 
    //
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        // LogInterceptor apply to all URLs.
        registry.addInterceptor(new LogInterceptor());
 
        // This URL is old, It no longer use.
        // Using OldURLInterceptor to redirecto to new URL.
        registry.addInterceptor(new OldLoginInterceptor())//
                .addPathPatterns("/admin/oldLogin");
 
        // This interceptor apply to URL like /admin/*
        // Exclude /admin/oldLogin
  
        registry.addInterceptor(new AdminInterceptor())//
                .addPathPatterns("/admin/*")//
                .excludePathPatterns("/admin/oldLogin");
    }
 
}
