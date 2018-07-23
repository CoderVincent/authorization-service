package com.wsn.controller;

import java.util.Iterator;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import com.wsn.pojo.Role_authorization;
import com.wsn.pojo.UserAuthorization;
import com.wsn.pojo.User_role;
import com.wsn.pojo.VerifyFunction;
import com.wsn.service.FunctionService;
import com.wsn.service.Role_AuthorizationService;
import com.wsn.service.UserRoleService;
import com.wsn.util.ObjectConnect;

/**
 * 
 * @author 张澧枫
 * @version 1.0
 * 
 */
@RestController
public class UserRoleController {
	
	@Resource
	private UserRoleService userRoleService;
	@Resource
	private Role_AuthorizationService roleAuthorizationService;
	@Resource
	private FunctionService funcService;

	/**
	 * Get a user
	 * @param id
	 * @return
	 */
	@RequestMapping(value="/user_role/{id}",method=RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<UserAuthorization>> getUR(@PathVariable("id") int id){
		
		User_role ur = userRoleService.queryUR(id);
		
		if(ur == null){
			System.out.println("NOT FOUND");
			return new ResponseEntity<List<UserAuthorization>>(HttpStatus.NOT_FOUND);
		}
		System.out.print("Get UR:"+ur.toString()+ur.getRole().getR_id());
		List<Role_authorization> ras = roleAuthorizationService.queryAByR(ur.getRole().getR_id());
		
		/**
		 * 拼接权限和用户信息
		 */
		List<UserAuthorization> uas=ObjectConnect.UAConnected(ur, ras);
		
		return new ResponseEntity<List<UserAuthorization>>(uas,HttpStatus.OK);
	}
	
	/**
	 * Create a user_role
	 * @param ur
	 * @param ucBuilder
	 * @return
	 */
	@RequestMapping(value="/user_role/",method=RequestMethod.POST)
	public ResponseEntity<Void> createUR(@RequestBody User_role ur,UriComponentsBuilder ucBuilder){
		System.out.println("Create a User_role:");
		userRoleService.addUR(ur);
		HttpHeaders httpheaders = new HttpHeaders();
		httpheaders.setLocation(ucBuilder.path("/user_role/{id}").buildAndExpand(ur.getUrId()).toUri());
		return new ResponseEntity<Void>(HttpStatus.OK);
	}
	
	/**
	 * Delete a User_role
	 * @param id
	 * @return
	 */
	@RequestMapping(value="/user_role/{id}",method=RequestMethod.DELETE)
	public ResponseEntity<Void> deleteUR(@PathVariable("id")int id){
		System.out.print("delete a user_role");
		User_role ur=userRoleService.queryURByUrid(id);
		if(ur == null){
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		}
		userRoleService.deleteUR(id);
		return new ResponseEntity<Void>(HttpStatus.OK);
	}
	
	/**
	 * verify Authorization
	 * @param vf
	 * @return
	 */
	@RequestMapping(value="/user_role/verifyAuthorization",method=RequestMethod.POST)
	public ResponseEntity<Boolean> verifyAuthorization(@RequestBody VerifyFunction vf){
		System.out.println("id="+vf.getId()+"/func="+vf.getFunctionNumber());
		Boolean resultFlag = false;
		//获取角色id
		Integer roleId = userRoleService.queryUR(vf.getId()).getRole().getR_id();
		//获取权限ID
		Integer funcIdGetBynumber = funcService.selectByNumber(vf.getFunctionNumber()).getfId();
		System.out.println("functionNumber="+funcIdGetBynumber);
		List<Role_authorization> ras= roleAuthorizationService.queryAByR(roleId);
		Iterator<Role_authorization> iter = ras.iterator();
		while(iter.hasNext()){
			if(iter.next().getFunction().getfId() == funcIdGetBynumber){
				resultFlag=true;
				return new ResponseEntity<Boolean>(resultFlag,HttpStatus.OK);
			}
		}
		return new ResponseEntity<Boolean>(resultFlag,HttpStatus.OK);
	}
}
