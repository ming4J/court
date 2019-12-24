package com.court.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.court.bean.Response;
import com.court.bean.User;
import com.court.mapper.UserMapper;
import com.court.services.UserServices;

/**
 * 
 * @author zJay~
 *
 */
@Service
public class UserServicesImpl implements UserServices{
	
	@Autowired
	private UserMapper userMapper;

	@Override
	public Response<String> login(String username, String password) {
		Response<String> response = new Response<String>();
		try {
			int count = userMapper.login(username, password);
			if(count <= 0) throw new Exception("用户名不存在或密码错误");
		} catch (Exception e) {
			response.setCode("400");
			response.setDesc(e.getMessage());
		}
		return response;
	}

	@Override
	@Transactional
	public Response<String> register(User user) {
		Response<String> response = new Response<String>();
		try {
			int count = userMapper.count(user.getUsername());
			if (count > 0) {
				throw new Exception("用户名已存在");
			}
			userMapper.register(user);
		} catch (Exception e) {
			response.setCode("400");
			response.setDesc(e.getMessage());
		}
		return response;
	}

	@Override
	public Response<User> query() {
		Response<User> response = new Response<User>();
		try {
			response.setList(userMapper.query());
		} catch (Exception e) {
			response.setCode("400");
			response.setDesc(e.getMessage());
		}
		return response;
	}

	@Override
	public Response<String> delete(String id) {
		Response<String> response = new Response<String>();
		try {
			userMapper.delete(id);
		} catch (Exception e) {
			response.setCode("400");
			response.setDesc(e.getMessage());
		}
		return response;
	}

	

}
