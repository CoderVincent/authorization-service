package com.wsn.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wsn.dao.Resource_data_object_typeMapper;
import com.wsn.pojo.Resource_data_object_type;
import com.wsn.service.ResourceDOTService;

@Service
public class ResourceDOTServiceImpl implements ResourceDOTService {

	@Autowired
	private Resource_data_object_typeMapper rdotMapper;
	
	@Override
	public List<Resource_data_object_type> selectROBydotId(Integer dotId) {
		return rdotMapper.selectRDBydotId(dotId);
	}

	@Override
	public List<Resource_data_object_type> selectROByrId(Integer rId) {
		return rdotMapper.selectRDByrId(rId);
	}

}
