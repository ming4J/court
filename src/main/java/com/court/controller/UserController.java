package com.court.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.court.bean.Response;
import com.court.bean.User;
import com.court.services.UserServices;


/**
 * 
 * @author zJay~
 *
 */
@RestController
@RequestMapping(value="/user")
public class UserController {
	
	@Autowired
	private UserServices userServices;

	/**
	 * 
	 * @param user
	 * @return
	 */
	@RequestMapping(value="/login",method=RequestMethod.POST)
    @ResponseBody
	public Response<String> login(@RequestBody User user) {
		return userServices.login(user.getUsername(), user.getPassword());
	}
	
	/**
	 * 
	 * @param user
	 * @return
	 */
	@RequestMapping(value="/register",method=RequestMethod.POST)
    @ResponseBody
	public Response<String> register(@RequestBody User user) {
		return userServices.register(user);  
	}
	
	/**
	 * 
	 * @return
	 */
	@RequestMapping(value="/query",method=RequestMethod.GET)
    @ResponseBody
	public Response<User> query() {
		return userServices.query();
	}
	
	/**
	 * 
	 * @param id
	 */
	@RequestMapping(value="/delete/{id}",method=RequestMethod.GET)
    @ResponseBody
	public Response<String> delete(@PathVariable String id) {
		return userServices.delete(id);
	}
}
