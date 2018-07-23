package com.wsn.serviceImpl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.wsn.dao.Role_authorizationMapper;
import com.wsn.pojo.Role_authorization;
import com.wsn.service.Role_AuthorizationService;

@Service
public class Role_AuthorizationServiceImpl implements Role_AuthorizationService{

	@Resource
	private Role_authorizationMapper ra;
	
	@Override
	public List<Role_authorization> queryAByR(Integer id) {
		return ra.selectAByR(id);
	}

}
