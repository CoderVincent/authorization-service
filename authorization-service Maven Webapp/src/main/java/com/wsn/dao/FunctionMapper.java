package com.wsn.dao;

import com.wsn.pojo.Function;

public interface FunctionMapper {
    int deleteByPrimaryKey(Integer fId);

    int insert(Function record);

    int insertSelective(Function record);

    Function selectROFByNumber(String functionNumber);

    int updateByPrimaryKeySelective(Function record);

    int updateByPrimaryKey(Function record);
    
    Function selectByKey(Integer fId);
    
    Function selectByNumber(String number);
}