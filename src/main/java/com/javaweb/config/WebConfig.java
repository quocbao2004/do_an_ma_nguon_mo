package com.javaweb.config;

import com.opensymphony.sitemesh.webapp.SiteMeshFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class WebConfig {
    @Bean
    public FilterRegistrationBean<com.opensymphony.sitemesh.webapp.SiteMeshFilter> siteMeshFilter() {
        FilterRegistrationBean<SiteMeshFilter> filter = new FilterRegistrationBean<>();
        filter.setFilter(new com.opensymphony.sitemesh.webapp.SiteMeshFilter());
        filter.addUrlPatterns("/*");
        return filter;
    }
}