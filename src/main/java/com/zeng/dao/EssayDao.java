package com.zeng.dao;

import com.zeng.pojo.Essay;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author cenghongyang
 */
@Repository
public interface EssayDao {
    /**
     * 获取所有文章
     * @return 返回所有文章列表
     */
    public List<Essay> getAllEssays();

    /**
     * 根据文章id查询对应文章
     * @param id    文章id
     * @return  返回文章对象
     */
    public Essay getEssayById(@Param("id") int id);
}
