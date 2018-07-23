package com.wsn.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wsn.dao.Data_object_typeMapper;
import com.wsn.pojo.Data_object_type;
import com.wsn.service.DataOTService;

@Service
public class DataOTServiceImpl implements DataOTService {

	@Autowired
	private Data_object_typeMapper dotMapper;
	
	@Override
	public void insertDataOT(Data_object_type dot) {
		// TODO Auto-generated method stub
		dotMapper.insert(dot);
	}

	@Override
	public void deleteDataOT(Integer id) {
		dotMapper.deleteByPrimaryKey(id);
	} 

	@Override
	public Data_object_type queryById(Integer id) {
		return dotMapper.queryDotById(id);
	}

	@Override
	public void updateDataOT(Data_object_type dot) {
		dotMapper.updateDotById(dot);
	}

}
