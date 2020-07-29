package com.nmbiss.shop.dao;

import com.nmbiss.shop.entity.Dealer;

public interface DealerMapper {
    /**通过主键删除
     * @param id  唯一主键
     * @return 操作影响的行数
     */
    int deleteByPrimaryKey(Integer id);

    /**插入
     * @param record dealer对象
     * @return 操作影响的行数
     */
    int insert(Dealer record);

    /**插入字段
     * @param record dealer对象
     * @return 操作影响的行数
     */
    int insertSelective(Dealer record);

    /**
     * 查找dealer
     * @param id 唯一主键
     * @return dealer对象
     */
    Dealer selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Dealer record);

    int updateByPrimaryKey(Dealer record);
}