package com.study.service;

import com.study.model.User;

public class UserServiceImpl implements UserService{
    @Override
    public User queryById(int i) {
        User user=new User();
        user.setId(i);
        user.setName("user_"+i);
        return user;
    }
}
