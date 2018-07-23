package com.wsn.service;

import java.util.List;

import com.wsn.pojo.Resource_data_object_type;

public interface ResourceDOTService {
	List<Resource_data_object_type> selectROBydotId(Integer dotId);
	
	List<Resource_data_object_type> selectROByrId(Integer rId);
}
