package com.wsn.dao;

import java.util.List;

import com.wsn.pojo.Resource_data_object_type;

public interface Resource_data_object_typeMapper {
    int deleteByPrimaryKey(Integer rdotId);

    int insert(Resource_data_object_type record);

    int insertSelective(Resource_data_object_type record);

    Resource_data_object_type selectByPrimaryKey(Integer rdotId);

    int updateByPrimaryKeySelective(Resource_data_object_type record);

    int updateByPrimaryKey(Resource_data_object_type record);
    
    List<Resource_data_object_type> selectRDBydotId(Integer dotId);
    
    List<Resource_data_object_type> selectRDByrId(Integer rId);
}