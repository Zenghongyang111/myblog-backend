package com.zeng.service.dao;

import com.zeng.pojo.Essay;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author cenghongyang
 */
public interface EssayServiceDao {
    /**
     * 获取所有文章并转换为Json对象
     * @return 返回Json对象
     */
    public Object getAllEssays();

    /**
     * 根据id查询文章并转换为Json对象
     * @param id    文章id
     * @return  返回Json对象
     */
    public Object getEssayById(int id);

    /**
     * 根据文章标签查询对应文章
     * @param id 标签id
     * @return 返回 文章列表
     */
    public Object getEssaysByTagId( int id);
}
