package com.zwz.dao;

import com.zwz.entity.GoodsColor;

public interface GoodsColorMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(GoodsColor record);

    int insertSelective(GoodsColor record);

    GoodsColor selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(GoodsColor record);

    int updateByPrimaryKeyWithBLOBs(GoodsColor record);

    int updateByPrimaryKey(GoodsColor record);
}