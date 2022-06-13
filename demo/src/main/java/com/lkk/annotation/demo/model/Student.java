package com.lkk.annotation.demo.model;

import ch.qos.logback.classic.net.SimpleSSLSocketServer;

/**
 * @ClassName Student
 * @Description //TODO
 * @Author lkk
 * Date 2022/06/13/9:41
 * @Version 1.0
 **/
public class Student {
    private String name;
    private String id;
    private String age;

    public Student(){};
    public Student(String name,String id,String age){
        this.age=age;
        this.name=name;
        this.id=id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
