package com.zeng.service.dao;

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
}
