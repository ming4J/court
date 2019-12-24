package com.court;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import com.court.filter.CustomFilter;

/**
 * @author shellming
 */
@MapperScan("com.court.mapper")
@SpringBootApplication
@EnableTransactionManagement
public class CourtApplication {

    public static void main(String[] args) {
        SpringApplication.run(CourtApplication.class, args);
    }
    @Bean
    public FilterRegistrationBean<CustomFilter> customFilterRegistration() {
        FilterRegistrationBean<CustomFilter> registration = new FilterRegistrationBean<CustomFilter>();
        registration.setFilter(new CustomFilter());
        registration.addUrlPatterns("/*");
        registration.addInitParameter("paramName", "paramValue");
        registration.setName("customFilter");
        registration.setOrder(1);
        return registration;
    }

}
