package com.lkk.fifter.demo.controller;

import com.lkk.fifter.demo.annotation.AuthAnnotation;
import com.lkk.fifter.demo.enums.AuthEnum;
import com.lkk.fifter.demo.events.AuthEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName Test
 * @Description //TODO
 * @Author lkk
 * Date 2022/06/14/10:49
 * @Version 1.0
 **/
@RestController
@RequestMapping("test")
public class Test {

    @Autowired
    private ApplicationContext applicationContext;

    @AuthAnnotation
    @GetMapping("/test1")
    public String getName1(){
        applicationContext.publishEvent(new AuthEvent(this));
        return "my name xiaoming1";
    }

    @AuthAnnotation(AuthEnum.ERROR)
    @GetMapping("/test2")
    public String getName2(){
        return "my name xiaohong";
    }


    @GetMapping("/test3")
    public String getName3(){
        return "my name xiaohong2";
    }
}
