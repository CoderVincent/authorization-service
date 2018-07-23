package com.wsn.dao;

import com.wsn.pojo.User_role;

public interface User_roleMapper {
    int deleteByPrimaryKey(Integer urId);

    int insert(User_role record);

    //绑定一个用户和角色
    int insertSelective(User_role record);

    //查询一个用户角色关系
    User_role selectByPrimaryKey(Integer urId);

    int updateByPrimaryKeySelective(User_role record);

    int updateByPrimaryKey(User_role record);
    
    //user和role的关联查询
    User_role selectURByUid(Integer uId);
}