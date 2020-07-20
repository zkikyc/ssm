package com.kikyc.dao;


import com.kikyc.bean.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserDao {

    int insert(User user);

    List<User> list();

    int update(User user);
}
