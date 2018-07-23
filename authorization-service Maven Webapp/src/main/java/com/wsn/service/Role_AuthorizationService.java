package com.wsn.service;

import java.util.List;

import com.wsn.pojo.Role_authorization;

public interface Role_AuthorizationService {
	List<Role_authorization> queryAByR(Integer id);
}
