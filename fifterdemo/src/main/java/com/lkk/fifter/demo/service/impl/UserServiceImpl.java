package com.lkk.fifter.demo.service.impl;

import com.lkk.fifter.demo.model.UserModel;
import com.lkk.fifter.demo.service.UserService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName UserServiceImpl
 * @Description //TODO
 * @Author lkk
 * Date 2022/06/16/15:16
 * @Version 1.0
 **/
@Service
public class UserServiceImpl implements UserService {


    static List<UserModel> list = new ArrayList<>();

    static {
        list.add(new UserModel("xiaoma", 12));
        list.add(new UserModel("xiaoming", 25));
        list.add(new UserModel("xiaoniao", 17));
        list.add(new UserModel("xiaohong", 18));
        list.add(new UserModel("xiaozhu", 54));


    }

    @Override
    public List<UserModel> getUserList() {
        return list;
    }
}
