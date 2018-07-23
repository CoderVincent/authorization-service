package com.wsn.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.wsn.pojo.Resource_data_object_type;
import com.wsn.service.ResourceDOTService;

@RestController
public class ResourceDOTController {
	
	@Autowired
	private ResourceDOTService resourceDOTService;
	
	
	/**
	 * get a rdot by dotID
	 * @param id
	 * @return
	 */
	@RequestMapping(value="/resourceDOT/{id}",method=RequestMethod.GET)
	public ResponseEntity<List<Resource_data_object_type>> selectROBydotID(@PathVariable("id") int id){
		System.out.println("Get a resourceDOT bY DOTID");
		List<Resource_data_object_type> rdot = resourceDOTService.selectROBydotId(id);
		if(rdot == null){
			System.out.println("NOT FOUND");
			return new ResponseEntity<List<Resource_data_object_type>>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<List<Resource_data_object_type>>(rdot,HttpStatus.OK);
	} 
	
//	/**
//	 * get a rdot by rid
//	 * @param id
//	 * @return
//	 */
//	@RequestMapping(value="/resourceDOT/{id}",method=RequestMethod.GET)
//	public ResponseEntity<Resource_data_object_type> selectROByrId(@PathVariable("id")int id){
//		System.out.println("get a resourceDOT by rid");
//		Resource_data_object_type rdot = resourceDOTService.selectROByrId(id);
//		if(rdot == null){
//			return new ResponseEntity<Resource_data_object_type>(HttpStatus.NOT_FOUND);
//		}
//		return new ResponseEntity<Resource_data_object_type>(rdot,HttpStatus.OK);
//	}
}
