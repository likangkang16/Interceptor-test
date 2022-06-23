package com.lkk.fifter.demo.config;

import com.lkk.fifter.demo.fifter.AuthFifter;
import com.lkk.fifter.demo.until.PathUntis;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


/**
 * @ClassName AuthFifterConfig
 * @Description //TODO
 * @Author lkk
 * Date 2022/06/15/10:02
 * @Version 1.0
 **/
@Configuration
public class AuthFifterConfig {

    @Autowired
    private AuthFifter authFifter;

    @Bean
    public FilterRegistrationBean getAuthFilter(){
        FilterRegistrationBean filterRegistration =new FilterRegistrationBean();
        filterRegistration.setFilter(authFifter);
        filterRegistration.setUrlPatterns(PathUntis.addList);
        filterRegistration.setOrder(-1);
        return filterRegistration;
    }
}
