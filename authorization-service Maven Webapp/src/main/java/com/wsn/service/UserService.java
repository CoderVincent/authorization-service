package com.wsn.service;

import java.util.List;

import com.wsn.pojo.User;

public interface UserService {
	public User getUserById(int userid);
	
	public void insertUser(User user);
	
	public void addUser(User user);
	
	public List<User> getAllUser();
	
	public void updateUser(User user);
	
	public void removeUser(int id);
	
	public void removeAllUsers();
	
}
