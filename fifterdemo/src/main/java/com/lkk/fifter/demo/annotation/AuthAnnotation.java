package com.lkk.fifter.demo.annotation;

import com.lkk.fifter.demo.enums.AuthEnum;
import jdk.nashorn.internal.ir.annotations.Reference;

import javax.annotation.Resource;
import java.lang.annotation.*;

/**
 * @ClassName AuthEnum
 * @Description //TODO
 * @Author lkk
 * Date 2022/06/15/10:45
 * @Version 1.0
 **/
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD,ElementType.TYPE})
public  @interface AuthAnnotation {
    AuthEnum value() default AuthEnum.SUCESS;
}
