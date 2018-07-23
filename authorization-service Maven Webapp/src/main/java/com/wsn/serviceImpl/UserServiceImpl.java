package com.wsn.serviceImpl;


import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.wsn.dao.UserDao;
import com.wsn.pojo.User;
import com.wsn.service.UserService;



@Service("userService")  
public class UserServiceImpl implements UserService {  
  @Resource  
  private UserDao userDao;  
    
  public User getUserById(int userId) {  
      return userDao.queryByPrimaryKey(userId);  
  }  

  public void insertUser(User user) {  
      userDao.insertUser(user);  
  }  

  public void addUser(User user) {  
      userDao.insertUser(user);  
  }  

  @Override  
  public List<User> getAllUser() {  
      return userDao.getAllUser();  
  }

  public void updateUser(User user) {
	userDao.updateByPrimaryKey(user);	
  }

	@Override
	public void removeUser(int id) {
		userDao.deleteByPrimaryKey(id);
	}

	@Override
	public void removeAllUsers() {
		userDao.deleteAllUsers();
	}  
  
}  