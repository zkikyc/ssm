package com.kikyc.controller;


import com.kikyc.bean.User;
import com.kikyc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;

@Controller
public class UserController {

    @Autowired
    private UserService userService;


    @RequestMapping("list")
    @Transactional
    public String list(Map<String,Object> map){
        List<User> list = userService.list();
//        map.put("data",userService.insert(new User("2","ls","ls123")));
        map.put("data",list);
        List<User> list2 = userService.list();
        map.put("data2",list2);
        return "success";
    }

    @RequestMapping("list2")
    public String list2(Map<String,Object> map){
        List<User> list = userService.list();
        map.put("data",list);
//        List<User> list2 = userService.list();
//        map.put("data2",list2);
        return "success";
    }

    @RequestMapping("update")
    public String update(Map<String,Object> map){
        int num = userService.update(new User("2","ls","ls123"));
        map.put("data","修改成功!"+num+"条");
        return "success";
    }


}
