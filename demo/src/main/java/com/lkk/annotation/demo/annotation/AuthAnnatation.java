package com.lkk.annotation.demo.annotation;

import com.lkk.annotation.demo.eunm.AuthEnum;

import java.lang.annotation.*;

/**
 * @ClassName AuthAnnatation
 * @Description //TODO
 * @Author lkk
 * Date 2022/06/11/11:06
 * @Version 1.0
 **/
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD,ElementType.TYPE})
public @interface AuthAnnatation {

    AuthEnum[] value();
}
