package com.wsn.dao;

import com.wsn.pojo.Role_authorization_object;

public interface Role_authorization_objectMapper {
    int deleteByPrimaryKey(Integer raoId);

    int insert(Role_authorization_object record);

    int insertSelective(Role_authorization_object record);

    Role_authorization_object selectByPrimaryKey(Integer raoId);

    int updateByPrimaryKeySelective(Role_authorization_object record);

    int updateByPrimaryKey(Role_authorization_object record);
}