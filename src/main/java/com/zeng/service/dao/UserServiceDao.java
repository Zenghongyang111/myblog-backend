package com.zeng.service.dao;

import com.zeng.pojo.User;

import java.util.List;

/**
 * @author cenghongyang
 */
public interface UserServiceDao {

    /**
     * 获取所有用户
     * @return 返回用户列表
     */
    public Object getUsers();

    /**
     * 根据用户信息查询用户
     * @param name 姓名
     * @param pwd 密码
     * @return  返回用户信息
     */
    public User getUsersByNameAndPwd(String name , String pwd);
}
