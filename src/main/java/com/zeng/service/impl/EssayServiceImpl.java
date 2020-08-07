package com.zeng.service.impl;

import com.alibaba.fastjson.JSON;
import com.zeng.dao.EssayDao;
import com.zeng.service.dao.EssayServiceDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author cenghongyang
 */
@Service
public class EssayServiceImpl implements EssayServiceDao {

    @Autowired
    EssayDao essayDao;
    /**
     * 获取所有文章并转换为Json对象
     *
     * @return 返回Json对象
     */
    @Override
    public Object getAllEssays() {
        return JSON.toJSON(essayDao.getAllEssays());
    }

    /**
     * 根据id查询文章并转换为Json对象
     *
     * @param id 文章id
     * @return 返回Json对象
     */
    @Override
    public Object getEssayById(int id) {
        return JSON.toJSON(essayDao.getEssayById(id));
    }

    /**
     * 根据文章标签查询对应文章
     *
     * @param id 标签id
     * @return 返回 文章列表
     */
    @Override
    public Object getEssaysByTagId(int id) {
        return essayDao.getEssaysByTagId(id);
    }
}
