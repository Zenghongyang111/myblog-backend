package com.zeng.dao;

import com.zeng.pojo.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author cenghongyang
 */
@Repository
public interface UserDao {

    /**
     * 获取所有用户
     * @return 返回用户列表
     */
    public List<User> getAllUsers();

    /**
     * 根据姓名和密码获取用户
     * @param name 姓名
     * @param pwd  密码
     * @return 返回用户对象
     */
    public User getUserByNameAndPwd(@Param("name") String name, @Param("pwd") String pwd);
}
