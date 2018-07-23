package com.wsn.serviceImpl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.wsn.dao.FunctionMapper;
import com.wsn.pojo.Function;
import com.wsn.service.FunctionService;

@Service
public class FunctionServiceImpl implements FunctionService {
	@Resource
	private FunctionMapper functionMapper;
	
	public Function selectByNumber(String functionNumber) {
		return functionMapper.selectByNumber(functionNumber);
	}

	public void insertFunction(Function func) {
		functionMapper.insert(func);
	}

	public void deleteFunction(Integer id) {
		functionMapper.deleteByPrimaryKey(id);
	}

	public void updateFunction(Function func) {
		functionMapper.updateByPrimaryKey(func);
	}

	@Override
	public Function selectById(Integer id) {
		return functionMapper.selectByKey(id);
	}
}
