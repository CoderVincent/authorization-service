package com.wsn.serviceImpl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.wsn.dao.ResourceDao;
import com.wsn.service.ResourceService;

@Service
public class ResourceServiceImpl implements ResourceService {

	@Resource
	private ResourceDao resourceDao;

	public com.wsn.pojo.Resource selectResById(Integer resourceId) {
		return resourceDao.selectByPrimaryKey(resourceId);
	}

	@Override
	public List<com.wsn.pojo.Resource> selectAllRes() {
		return null;
	}

	@Override
	public void addResource(com.wsn.pojo.Resource res) {
		resourceDao.insert(res);
	}

	@Override
	public void deleteResourceById(Integer resourceId) {
		resourceDao.deleteByPrimaryKey(resourceId);
	}

	@Override
	public void updateResourceById(com.wsn.pojo.Resource res) {
		resourceDao.updateByPrimaryKey(res);
	}

}
