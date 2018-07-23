package com.wsn.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wsn.dao.User_roleMapper;
import com.wsn.pojo.User_role;
import com.wsn.service.UserRoleService;

@Service
public class UserRoleServiceImpl implements UserRoleService{

	@Autowired
	private User_roleMapper userRoleMapper;

	@Override
	public User_role queryUR(Integer uId) {
		return userRoleMapper.selectURByUid(uId);
	}

	public User_role queryURByUrid(Integer urId){
		return userRoleMapper.selectByPrimaryKey(urId);
	}
	
	@Override
	public void addUR(User_role ur) {
		// TODO Auto-generated method stub
		userRoleMapper.insert(ur);
	}

	@Override
	public void deleteUR(Integer urId) {
		// TODO Auto-generated method stub
		userRoleMapper.deleteByPrimaryKey(urId);
	}

	
}
