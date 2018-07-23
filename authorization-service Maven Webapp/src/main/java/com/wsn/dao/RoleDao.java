package com.wsn.dao;

import java.util.List;
import java.util.Map;

import com.wsn.pojo.Role;

public interface RoleDao {
	  public Role queryByPrimaryKey(Integer id);  
	    
	  public List<Role> queryRoleByBatch(Map<String,Object> params);  
	    
	  public void insertRole(Role role);  
	    
	  public void insertRoleByBatch(List<Role> list);  
	    
	  public void deleteByPrimaryKey(Integer id);  
	    
	  public void deleteRoleByBatch(Map<String,Object> params);  
	  
	  public void deleteAllRoles();
	    
	  public void updateByPrimaryKey(Role role);  

	  public List<Role> getAllRole();  
}
