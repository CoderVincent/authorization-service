package com.wsn.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import com.wsn.pojo.Data_object_type;
import com.wsn.service.DataOTService;

@RestController
public class DataOTController {

	@Autowired
	private DataOTService dataOtService;
	
	/**
	 * add a type
	 * @param dot
	 * @param urBuilders
	 * @return
	 */
	@RequestMapping(value="/dataObjectType/",method=RequestMethod.POST)
	public ResponseEntity<Void> insertDataOT(@RequestBody Data_object_type dot,UriComponentsBuilder urBuilders){
		System.out.println("添加一个部门类型");
		dataOtService.insertDataOT(dot);
		HttpHeaders headers=new HttpHeaders();
		headers.setLocation(urBuilders.path("/DataObjectType/{id}").buildAndExpand(dot.getDotId()).toUri());
		return new ResponseEntity<Void>(HttpStatus.OK);
	}
	
	/**
	 * delete a type
	 * @param id
	 * @return
	 */
	@RequestMapping(value="/dataObjectType/{id}",method=RequestMethod.DELETE)
	public ResponseEntity<Void> deleteDataOT(@PathVariable("id")int id){
		System.out.println("delete a type");
		Data_object_type dot = dataOtService.queryById(id);
		if(dot == null){
			System.out.println("not found");
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		}
		dataOtService.deleteDataOT(id);
		return new ResponseEntity<Void>(HttpStatus.OK);
	}
	
	
	/**
	 * update a type
	 * @param dot
	 * @return
	 */
	@RequestMapping(value="/dataObjectType/",method=RequestMethod.PUT)
	public ResponseEntity<Void> updataDataOT(@RequestBody Data_object_type dot){
		System.out.println("update a type");
		Data_object_type dataType = dataOtService.queryById(dot.getDotId());
		if(dataType == null){
			System.out.println("NOT exist");
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		}
		dataOtService.updateDataOT(dot);
		return new ResponseEntity<Void>(HttpStatus.OK);
	}
	
	
	/**
	 * Get a type by id
	 * @param id
	 * @return
	 */
	@RequestMapping(value="/dataObjectType/{id}",method=RequestMethod.GET)
	public ResponseEntity<Data_object_type> querDataOT(@PathVariable("id") int id){
		System.out.print("query a type");
		Data_object_type data_object_type = dataOtService.queryById(id);
		if(data_object_type == null){
			System.out.println("NOTFOUND");
			return new ResponseEntity<Data_object_type>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<Data_object_type>(data_object_type,HttpStatus.OK);
	}
}
