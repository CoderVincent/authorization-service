package com.wsn.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.wsn.pojo.Role_authorization;
import com.wsn.service.Role_AuthorizationService;

@RestController
public class Role_AuthorizationController {
	
	@Resource
	private Role_AuthorizationService roleAuthorizationService;
	
	/**
	 * 角色权限查询
	 * @param id
	 * @return
	 */
	@RequestMapping(value="/role_authorization/{id}",method=RequestMethod.GET)
	public ResponseEntity<List<Role_authorization>> selectAByR(@PathVariable("id") int id){
		System.out.println("GET A Authorization");
		List<Role_authorization> roleAuthorizationlist = roleAuthorizationService.queryAByR(id);
		if(roleAuthorizationlist == null){
			System.out.print("not found");
			return new ResponseEntity<List<Role_authorization>>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<List<Role_authorization>>(roleAuthorizationlist,HttpStatus.OK);
	}
}
