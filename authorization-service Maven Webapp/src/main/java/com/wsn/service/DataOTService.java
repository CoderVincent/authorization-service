package com.wsn.service;

import com.wsn.pojo.Data_object_type;

public interface DataOTService {
	void insertDataOT(Data_object_type dot);
	
	void deleteDataOT(Integer id);
	
	Data_object_type queryById(Integer id);
	
	void updateDataOT(Data_object_type dot);
}
