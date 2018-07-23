package com.wsn.service;

import java.util.List;

import com.wsn.pojo.Role;

public interface RoleService {
	public Role getRoleById(int roleid);
	
	public void insertRole(Role role);
	
	public void addRole(Role role);
	
	public List<Role> getAllRole();
	
	public void updateRole(Role role);
	
	public void removeRole(int id);
	
	public void removeAllRoles();
	
}
