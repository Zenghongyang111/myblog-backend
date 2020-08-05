package com.zeng.test;

import com.zeng.ZengApplication;
import com.zeng.dao.EssayDao;
import com.zeng.dao.UserDao;
import com.zeng.service.impl.UserServiceImpl;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author cenghongyang
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = ZengApplication.class)// 就是你springboot的启动类
public class Test {

    @Autowired
    private UserDao userDao;
    @Autowired
    EssayDao essayDao;
    @org.junit.Test
    public void show(){
        System.out.println(userDao.getAllUsers().get(0).toString());
    }
    @org.junit.Test
    public void showEssay(){
        System.out.println(essayDao.getEssayById(1).toString());
    }
}
