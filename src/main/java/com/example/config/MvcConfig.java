package com.example.config;


import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

public class MvcConfig implements WebMvcConfigurer {
    @Override
    public void configureViewResolvers(ViewResolverRegistry registry) {
        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
        registry.viewResolver(viewResolver);
        viewResolver.setPrefix("/WEB-INF/html/");
        viewResolver.setSuffix(".html");
        viewResolver.setViewClass(JstlView.class);
    }
}
