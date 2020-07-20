package com.kikyc.service.imp;

import com.kikyc.bean.User;
import com.kikyc.dao.UserDao;
import com.kikyc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {


    @Autowired
    private UserDao userDao;

    @Transactional(propagation =  Propagation.REQUIRES_NEW)
    public int insert(User user) {
        int num  = userDao.insert(user);
        return num;
    }

    public List<User> list() {
        return userDao.list();
    }

    public int update(User user) {
        return userDao.update(user);
    }
}
