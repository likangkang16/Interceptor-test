package com.lkk.annotation.demo.eunm;

/**
 * @ClassName AuthEnum
 * @Description //TODO
 * @Author lkk
 * Date 2022/06/11/11:02
 * @Version 1.0
 **/
public enum AuthEnum {

    AUTH_ENUM_ERROR("201","禁止操作改方法","禁止操作改方法"),
    AUTH_ENUM_INFO("200","可以操作改方法","可以操作改方法");
    private String code;
    private String desc;
    private String info;

    AuthEnum(){};
    AuthEnum(String code, String desc, String info){
        this.code=code;
        this.desc=desc;
        this.info=info;
    }

    public String getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }

    public String getInfo() {
        return info;
    }
}
