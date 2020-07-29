package com.nmbiss.shop.dao;

import com.nmbiss.shop.entity.Admin;

public interface AdminMapper {
    /**
     * deleteByPrimaryKey 通过主键删除行
     * @param id 唯一主键
     * @return 操作影响的行数
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * 插入新的
     * @param record admin对象
     * @return 操作影响的行数
     */
    int insert(Admin record);

    /**会对字段进行判断再插入（如果为null就不插入）
     * @param record admin对象
     * @return 操作影响的行数
     */
    int insertSelective(Admin record);

    /**
     * 选择
     * @param id 唯一主键
     * @return admin对象
     */
    Admin selectByPrimaryKey(Integer id);

    /**
     * 会对字段进行判断再更新（如果为null就不更新）
     * @param record admin对象
     * @return 操作影响的行数
     */
    int updateByPrimaryKeySelective(Admin record);

    int updateByPrimaryKey(Admin record);
}