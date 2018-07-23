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

import com.wsn.pojo.Role;
import com.wsn.service.RoleService;

@RestController
public class RoleController {
	
	@Resource
	private RoleService roleservice;
	
	/**
	 * Create a role
	 * @param role
	 * @return
	 */
	@RequestMapping(value="/role/",method=RequestMethod.POST)
	public ResponseEntity<Void> createRole(@RequestBody Role role,UriComponentsBuilder ucBuilder){
		/*
		 * 此处应该加入已存在用户判断*
		 */
		
		System.out.println("Create a role"+role.getRole_name());
		roleservice.addRole(role);
		
		HttpHeaders headers = new HttpHeaders();
		headers.setLocation(ucBuilder.path("/role/{id}").buildAndExpand(role.getR_id()).toUri());
		return new ResponseEntity<Void>(HttpStatus.OK);
	}
	
	/**
	 * Delete A Role
	 * @param id
	 * @return
	 */
	
	@RequestMapping(value="/role/{id}",method=RequestMethod.DELETE)
	public ResponseEntity<Void> deleteRole(@PathVariable("id") int id){
		Role role = roleservice.getRoleById(id);
		
		System.out.print("Delete a role");
		if(role != null){
			roleservice.removeRole(id);
			return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
		}
		
		return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
	}
	
	/**
	 * Get a Role
	 * @param id
	 * @return
	 */
	@RequestMapping(value="/role/{id}",method=RequestMethod.GET)
	public ResponseEntity<Role> getRoleById(@PathVariable("id") int id){
		System.out.println("Get a role");
		Role role = roleservice.getRoleById(id);
		if(role!=null){
			return new ResponseEntity<Role>(role,HttpStatus.OK);
		}
		return new ResponseEntity<Role>(HttpStatus.NOT_FOUND);
	}
	
	/**
	 * update a role
	 * @param id
	 * @return
	 */
	@RequestMapping(value="/role/",method=RequestMethod.PUT)
	public ResponseEntity<Void> updateRoleById(@PathVariable("id") int id){
		System.out.print("update a role");
		
		Role role = roleservice.getRoleById(id);
		if(role!=null){
			roleservice.updateRole(role);
			return new ResponseEntity<Void>(HttpStatus.OK);
		}
		return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
	}
}
