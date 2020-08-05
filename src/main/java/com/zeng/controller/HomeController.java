package com.zeng.controller;

import com.zeng.pojo.User;
import com.zeng.service.dao.UserServiceDao;
import com.zeng.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author cenghongyang
 */
@RestController
public class HomeController {

    @Autowired
    UserServiceDao userService;

    @ResponseBody
    @RequestMapping("/hello")
    public String index(){
        return "hello world";
    }

    @ResponseBody
    @RequestMapping("/users")
    public Object getUsers(){
       // return "hello world11111";
     return userService.getUsers() ;
    }
}
