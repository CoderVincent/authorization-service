package com.wsn.serviceImpl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.wsn.dao.RoleDao;
import com.wsn.pojo.Role;
import com.wsn.service.RoleService;

@Service("roleService")
public class RoleServiceImpl implements RoleService{

	@Resource
	private RoleDao roleDao;
	
	@Override
	public Role getRoleById(int roleid) {
		roleDao.queryByPrimaryKey(roleid);
		return null;
	}

	@Override
	public void insertRole(Role role) {
		roleDao.insertRole(role);
	}

	@Override
	public void addRole(Role role) {
		roleDao.insertRole(role);
	}

	@Override
	public List<Role> getAllRole() {

		return roleDao.getAllRole();
	}

	@Override
	public void updateRole(Role role) {
		roleDao.updateByPrimaryKey(role);
	}

	@Override
	public void removeRole(int id) {
		roleDao.deleteByPrimaryKey(id);
	}

	@Override
	public void removeAllRoles() {
		roleDao.deleteAllRoles();
	}
}
