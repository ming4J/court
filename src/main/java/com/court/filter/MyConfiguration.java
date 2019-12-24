package com.court.filter;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @ClassName MyConfiguration
 * @Description //TODO
 * @Author shellming
 * @Date 2019/12/24 7:04 下午
 **/
@Configuration
public class MyConfiguration {
    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/**")
                        .allowedOrigins("*")
                        .allowCredentials(true)
                        .allowedMethods("GET", "POST", "DELETE", "PUT","PATCH")
                        .maxAge(3600);
            }
        };
    }
}
