package com.wsn.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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

import com.wsn.pojo.User;
import com.wsn.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	private UserService userService;
	
	/**
	 * Get All Users
	 * @return
	 */
	@RequestMapping(value="/user/",method=RequestMethod.GET)
	public ResponseEntity<List<User>> listAllUsers(){
		List<User> users = userService.getAllUser();
		if(users.isEmpty()){
			return new ResponseEntity<List<User>>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<List<User>>(users,HttpStatus.OK);
	}
	
	/**
	 * Get single user
	 * @param id
	 * @return
	 */
	@RequestMapping(value="/user/{id}",method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<User> getUser(@PathVariable("id") int id) {
		System.out.println("Fecthing user with id"+id);
		User user= userService.getUserById(id);
		if(user == null){
			return new ResponseEntity<User>(HttpStatus.NOT_FOUND); 
		}
		return new ResponseEntity<User>(user,HttpStatus.OK);
	}
	
	
	/**
	 * Create a User
	 * @param user
	 * @param ucBuilder
	 * @return
	 */
	@RequestMapping(value="/user/",method = RequestMethod.POST)
	public ResponseEntity<Void> createUser(@RequestBody User user,UriComponentsBuilder ucBuilder){
		System.out.println("Creating User " + user.getNickname());
		userService.addUser(user);
		
		HttpHeaders headers = new HttpHeaders();
		headers.setLocation(ucBuilder.path("/user/{id}").buildAndExpand(user.getU_id()).toUri());
		return new ResponseEntity<Void>(headers,HttpStatus.CREATED);
	}
	
	/**
	 * update a user
	 * @param id
	 * @param user
	 * @return
	 */
	@RequestMapping(value="/user/{id}",method = RequestMethod.PUT)
	public ResponseEntity<Void> updateUser(@PathVariable("id") int id,@RequestBody User user){
		System.out.println("Update User id:" + id);
		User currentUser = userService.getUserById(id);
		
		if(currentUser == null){
			System.out.println("User id"+id+"NOT FOUND");
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		}
		
		currentUser.setNickname(user.getNickname());
		currentUser.setAccount(user.getAccount());
		currentUser.setPassword(user.getPassword());
		
		userService.updateUser(currentUser);
		return new ResponseEntity<Void>(HttpStatus.OK);
	}
	
	/**
	 * delete a user
	 * @param id
	 * @return
	 */
	@RequestMapping(value="/user/{id}",method = RequestMethod.DELETE)
	public ResponseEntity<User> deleteUser(@PathVariable("id") int id){
		System.out.println("delete user id"+id);
		
		User currentUser = userService.getUserById(id);
		
		if(currentUser == null){
			System.out.println("ID"+id+"not exsits");
			return new ResponseEntity<User>(HttpStatus.NOT_FOUND);
		}
		
		userService.removeUser(id);
		return new ResponseEntity<User>(HttpStatus.NO_CONTENT);
	}
	
	@RequestMapping(value="/user/",method = RequestMethod.DELETE)
	public ResponseEntity<User> deleteAllUsers(){
		System.out.println("delete all users");
		userService.removeAllUsers();
		return new ResponseEntity<User>(HttpStatus.OK);
	}
}
