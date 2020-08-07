package com.zeng.service.impl;

import com.alibaba.fastjson.JSON;
import com.zeng.dao.UserDao;
import com.zeng.pojo.User;
import com.zeng.service.dao.UserServiceDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
/**
 * @author cenghongyang
 */
@Service
public class UserServiceImpl implements UserServiceDao {

    @Autowired
    private UserDao userDao;
    /**
     * 获取所有用户
     *
     * @return 返回用户列表
     */
    @Override
    public Object getUsers() {
        return JSON.toJSON(userDao.getAllUsers());
    }

    /**
     * 根据用户信息查询用户
     *
     * @param name 姓名
     * @param pwd  密码
     * @return 返回用户信息
     */
    @Override
    public Object getUsersByNameAndPwd(String name, String pwd) {
        return JSON.toJSON(userDao.getUserByNameAndPwd(name,pwd));
    }


}
