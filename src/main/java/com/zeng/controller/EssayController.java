package com.zeng.controller;

import com.zeng.service.dao.EssayServiceDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @ResponseBody
    @RequestMapping(value = "/essay/{id}",method = RequestMethod.GET)
    public Object getEssayById(@PathVariable int id){
        return essayServiceDao.getEssayById(id);
    }

    @ResponseBody
    @RequestMapping(value = "/essay",method = RequestMethod.POST)
    public Object getEssaysByTagId(@RequestParam int tagId){

        return essayServiceDao.getEssaysByTagId(tagId);
    }
}
