package com.wsn.dao;

import java.util.List;

import com.wsn.pojo.Role_authorization;

public interface Role_authorizationMapper {
    int deleteByPrimaryKey(Integer raId);

    int insert(Role_authorization record);

    int insertSelective(Role_authorization record);

    Role_authorization selectByPrimaryKey(Integer raId);

    int updateByPrimaryKeySelective(Role_authorization record);

    int updateByPrimaryKey(Role_authorization record);
    
    List<Role_authorization> selectAByR(Integer id);
}