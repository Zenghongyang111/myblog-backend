package com.zeng.controller;

import com.zeng.service.dao.EssayServiceDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author cenghongyang
 */
@RestController
public class EssayController {

    @Autowired
    EssayServiceDao essayServiceDao;
    @ResponseBody
    @RequestMapping("/essays")
    public Object getAllEssays(){
        return essayServiceDao.getAllEssays();
    }
}
