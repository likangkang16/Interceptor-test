package com.lkk.fifter.demo.liserter;

import com.lkk.fifter.demo.events.AuthEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.EventListener;

/**
 *@ClassName AuthLister
 *@Description //TODO
 *@Author lkk
 *Date 2022/06/15/15:36
 *@Version 1.0
 **/
public class AuthLister  implements ApplicationListener<AuthEvent>   {
    @Override
    public void onApplicationEvent(AuthEvent authEvent) {
        System.out.println("hello lister");
        authEvent.getName();
    }
}
