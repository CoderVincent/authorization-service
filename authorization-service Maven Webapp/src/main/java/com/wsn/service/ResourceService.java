package com.wsn.service;

import java.util.List;

import com.wsn.pojo.Resource;

public interface ResourceService {
	Resource selectResById(Integer resourceId);
	
	List<Resource> selectAllRes();
	
	void addResource(Resource res);
	
	void deleteResourceById(Integer resourceId);
	
	void updateResourceById(Resource res);
}
