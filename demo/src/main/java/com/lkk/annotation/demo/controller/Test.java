package com.lkk.annotation.demo.controller;

import com.lkk.annotation.demo.annotation.AuthAnnatation;
import com.lkk.annotation.demo.eunm.AuthEnum;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @ClassName Test
 * @Description //TODO
 * @Author lkk
 * Date 2022/06/11/10:59
 * @Version 1.0
 **/
@RestController
@RequestMapping("test")
public class Test {



    @GetMapping("test1")
    @AuthAnnatation(AuthEnum.AUTH_ENUM_INFO)
    public String getHello1() {
        return "hello word";
    }


    @GetMapping("test2")
    @AuthAnnatation(AuthEnum.AUTH_ENUM_ERROR)
    public String getHello2() {
        return "hello word";
    }
}
