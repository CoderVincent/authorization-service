package com.wsn.dao;

import com.wsn.pojo.Data_object;

public interface Data_objectMapper {
    int deleteByPrimaryKey(Integer doId);

    int insert(Data_object record);

    int insertSelective(Data_object record);

    Data_object selectByPrimaryKey(Integer doId);

    int updateByPrimaryKeySelective(Data_object record);

    int updateByPrimaryKey(Data_object record);
}