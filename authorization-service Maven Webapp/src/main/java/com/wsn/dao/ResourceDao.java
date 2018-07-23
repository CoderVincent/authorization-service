package com.wsn.dao;

import com.wsn.pojo.Resource;

public interface ResourceDao {
    void deleteByPrimaryKey(Integer resourceId);

    void insert(Resource record);

    void insertSelective(Resource record);

    Resource selectByPrimaryKey(Integer resourceId);

    void updateByPrimaryKeySelective(Resource record);

    void updateByPrimaryKey(Resource record);
}