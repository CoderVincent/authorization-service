package com.wsn.dao;

import com.wsn.pojo.Data_object_type;

public interface Data_object_typeMapper {
    void deleteByPrimaryKey(Integer dotId);

    void insert(Data_object_type record);

    void insertSelective(Data_object_type record);
    
    Data_object_type queryDotById(Integer DotId);
    
    void updateDotById(Data_object_type dot);
}