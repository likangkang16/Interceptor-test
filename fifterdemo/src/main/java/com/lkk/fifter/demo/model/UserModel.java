package com.lkk.fifter.demo.model;

/**
 * @ClassName UserModel
 * @Description //TODO
 * @Author lkk
 * Date 2022/06/16/15:14
 * @Version 1.0
 **/
public class UserModel {

    public UserModel(){};
    public UserModel(String name,Integer age){
        this.age=age;
        this.name=name;
    }
    private String name;
    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "UserModel{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
