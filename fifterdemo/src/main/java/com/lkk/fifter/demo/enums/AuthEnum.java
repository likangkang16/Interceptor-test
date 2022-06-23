package com.lkk.fifter.demo.enums;

/**
 * @ClassName AuthEnum
 * @Description //TODO
 * @Author lkk
 * Date 2022/06/15/10:50
 * @Version 1.0
 **/
public enum AuthEnum {

    ERROR("500","错误"),
    SUCESS("200","成功");

    private String code;
    private String info;

    AuthEnum(){};
    AuthEnum(String code,String info){
        this.code=code;
        this.info=info;
    }

    public String getCode() {
        return code;
    }

    public String getInfo() {
        return info;
    }
}
