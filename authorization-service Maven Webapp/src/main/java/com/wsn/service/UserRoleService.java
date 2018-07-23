package com.wsn.service;

import com.wsn.pojo.User_role;

public interface UserRoleService {
	User_role queryUR(Integer uId);
	
	void addUR(User_role ur);
	
	void deleteUR(Integer urId);
	
	User_role queryURByUrid(Integer urId);
}
