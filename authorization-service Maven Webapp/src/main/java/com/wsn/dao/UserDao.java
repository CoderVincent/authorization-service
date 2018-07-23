package com.wsn.dao;


import java.util.List;
import java.util.Map;

import com.wsn.pojo.User;


public interface UserDao {  
    
  public User queryByPrimaryKey(Integer id);  
    
  public List<User> queryUserByBatch(Map<String,Object> params);  
    
  public void insertUser(User user);  
    
  public void insertUserByBatch(List<User> list);  
    
  public void deleteByPrimaryKey(Integer id);  
    
  public void delteUserByBatch(Map<String,Object> params);  
  
  public void deleteAllUsers();
    
  public void updateByPrimaryKey(User user);  

  public List<User> getAllUser();  
    
}  