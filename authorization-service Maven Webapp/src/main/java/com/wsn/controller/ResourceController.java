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

import com.wsn.pojo.Resource;
import com.wsn.service.ResourceService;

@RestController
public class ResourceController {
	
	@Autowired
	private ResourceService resourceService;

	/**
	 * Get a Resource
	 * @param id
	 * @return
	 */
	@RequestMapping(value="/resource/{id}",method=RequestMethod.GET)
	public ResponseEntity<Resource> queryResource(@PathVariable("id") int id){
		System.out.print("GET A ResourceAuthorization");
		Resource resource = resourceService.selectResById(id);
		if(resource == null){
			return new ResponseEntity<Resource>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<Resource>(resource,HttpStatus.OK);
	}
	
	/**
	 * add a Resource
	 * @param resource
	 * @param uriBuilder
	 * @return
	 */
	@RequestMapping(value="/resource/",method=RequestMethod.POST)
	public ResponseEntity<Void> addResource(@RequestBody Resource resource,UriComponentsBuilder uriBuilder){
		System.out.println("add a resource");
		resourceService.addResource(resource);
		
		HttpHeaders httpHeader = new HttpHeaders();
		httpHeader.setLocation(uriBuilder.path("/resource/{id}").buildAndExpand(resource.getResourceId()).toUri());
		return new ResponseEntity<Void>(HttpStatus.OK);
	}
	
	/**
	 * delete a resource
	 * @param id
	 * @return
	 */
	@RequestMapping(value="/resource/{id}",method=RequestMethod.DELETE)
	public ResponseEntity<Void> deleteResource(@PathVariable("id") int id){
		System.out.println("delete a Resource");
		Resource res = resourceService.selectResById(id);
		if(res != null){
			resourceService.deleteResourceById(id);
			return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
		}
		
		return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
	}
	
	/**
	 * update a resource
	 * @param res
	 * @return
	 */
	@RequestMapping(value="/resource/",method=RequestMethod.PUT)
	public ResponseEntity<Void> updateResource(@RequestBody Resource res){
		System.out.println("updata a resource");
		Resource resource = resourceService.selectResById(res.getResourceId());
		if(resource == null){
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		}
		resourceService.updateResourceById(res);
		return new ResponseEntity<Void>(HttpStatus.OK);
	}
}
