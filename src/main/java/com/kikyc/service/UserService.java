package com.kikyc.service;

import com.kikyc.bean.User;

import java.util.List;


public interface UserService {

    int insert(User user);

    List<User> list();

    int update(User user);
}
