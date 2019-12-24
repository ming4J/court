package com.court.services;

import com.court.bean.Response;
import com.court.bean.User;

/**
 * 
 * @author zJay~
 *
 */
public interface UserServices {

	/**
	 * 
	 * @param username
	 * @param password
	 * @return
	 */
	public Response<String> login(String username,String password);
	
	/**
	 * 
	 * @param user
	 * @return
	 */
	public Response<String> register(User user);
	
	/**
	 * 
	 * @return
	 */
	public Response<User> query();
	
	/**
	 * 
	 * @param id
	 * @return
	 */
	public Response<String> delete(String id);
}
