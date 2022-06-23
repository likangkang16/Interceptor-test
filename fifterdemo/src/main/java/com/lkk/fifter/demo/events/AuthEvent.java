package com.lkk.fifter.demo.events;

import org.springframework.context.ApplicationEvent;

/**
 * @ClassName AuthEvent
 * @Description //TODO
 * @Author lkk
 * Date 2022/06/16/10:03
 * @Version 1.0
 **/
public class AuthEvent extends ApplicationEvent {
    public AuthEvent(Object source) {
        super(source);
    }

    public void getName(){
        System.out.println("我是监听器！");
    }
}
