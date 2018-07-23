package com.wsn.dao;

import com.wsn.pojo.Operate_type;

public interface Operate_typeMapper {
    int deleteByPrimaryKey(Integer otId);

    int insert(Operate_type record);

    int insertSelective(Operate_type record);

    Operate_type selectByPrimaryKey(Integer otId);

    int updateByPrimaryKeySelective(Operate_type record);

    int updateByPrimaryKey(Operate_type record);
}