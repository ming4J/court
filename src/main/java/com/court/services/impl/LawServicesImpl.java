package com.court.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.court.bean.Law;
import com.court.bean.Response;
import com.court.mapper.LawMapper;
import com.court.services.LawServices;

/**
 * 
 * @author zJay~
 *
 */
@Service
public class LawServicesImpl implements LawServices{
	
	@Autowired
	private LawMapper lawMapper;

	@Override
	public Response<Law> query() {
		Response<Law> response = new Response<Law>();
		try {
			response.setList(lawMapper.query());
		} catch (Exception e) {
			response.setCode("400");
			response.setDesc(e.getMessage());
		}
		return response;
	}

	@Override
	public Response<String> add(Law law) {
		Response<String> response = new Response<String>();
		try {
			int count = lawMapper.count(law.getLawtit());
			if(count > 0) {
				throw new Exception("发条已存在");
			}
			lawMapper.add(law);
		} catch (Exception e) {
			response.setCode("400");
			response.setDesc(e.getMessage());
		}
		return response;
	}

	
}
