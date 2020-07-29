package com.nmbiss.shop.dao;

import com.nmbiss.shop.entity.DealerStock;

public interface DealerStockMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(DealerStock record);

    int insertSelective(DealerStock record);

    DealerStock selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(DealerStock record);

    int updateByPrimaryKey(DealerStock record);
}