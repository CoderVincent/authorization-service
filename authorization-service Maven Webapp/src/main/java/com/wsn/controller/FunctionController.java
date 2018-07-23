package com.wsn.controller;

import javax.annotation.Resource;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import com.wsn.pojo.Function;
import com.wsn.service.FunctionService;

@RestController
public class FunctionController {
	
	@Resource
	private FunctionService functionService;
	
	/**
	 * GET A FUNCTION
	 * @param id
	 * @return
	 */
	@RequestMapping(value="/function/{functionName}",method=RequestMethod.GET)
	public ResponseEntity<Function> queryFunctionById(@PathVariable("functionName") String functionNumber){
		System.out.print("Select a function");
		Function function = functionService.selectByNumber(functionNumber);
		if(function == null){
			System.out.println("NOT FOUND");
			return new ResponseEntity<Function>(HttpStatus.NOT_FOUND);
		}
		System.out.println(function);
		return new ResponseEntity<Function>(function,HttpStatus.OK);
	}
	
	/**
	 * Create a function
	 * @param func
	 * @param ucbuilder
	 * @return
	 */
	@RequestMapping(value="/function/",method=RequestMethod.POST)
	public ResponseEntity<Void> addFunction(@RequestBody Function func,UriComponentsBuilder ucbuilder){
		System.out.print("add a function");
		
		functionService.insertFunction(func);
		HttpHeaders headers = new HttpHeaders();
		headers.setLocation(ucbuilder.path("/function/{id}").buildAndExpand(func.getfId()).toUri());
		return new ResponseEntity<Void>(headers,HttpStatus.CREATED);
	}
	
	
	/**
	 * 删除一个功能权限/删除时参照该表的数据也会删除
	 * @param id
	 * @return
	 */
	@RequestMapping(value="/function/{id}",method=RequestMethod.DELETE)
	public ResponseEntity<Void> deleteFunction(@PathVariable("id") int id){
		System.out.println("delete a function");
		Function function = functionService.selectById(id);
		if(function == null){
			System.out.println("NOT FOUND");
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		}
		functionService.deleteFunction(id);
		return new ResponseEntity<Void>(HttpStatus.OK);
	}
	
	/**
	 * update a func
	 * @param func
	 * @return
	 */
	@RequestMapping(value="/function/{id}",method=RequestMethod.PUT)
	public ResponseEntity<Void> updataFunction(@RequestBody Function func){
		System.out.println("Update a function");
		Function f = functionService.selectById(func.getfId());
		if(f == null){
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		}
		functionService.updateFunction(func);
		return new ResponseEntity<Void>(HttpStatus.OK);
	}
}
