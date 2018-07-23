package com.wsn.service;

import com.wsn.pojo.Function;

public interface FunctionService {
	Function selectByNumber(String functionNumber);

	Function selectById(Integer id);
	
	void insertFunction(Function func);
	
	void deleteFunction(Integer id);
	
	void updateFunction(Function func);
}
