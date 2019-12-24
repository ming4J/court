package com.court.services;

import com.court.bean.Law;
import com.court.bean.Response;

/**
 * 
 * @author zJay~
 *
 */
public interface LawServices {

	/**
	 * 
	 * @return
	 */
	public Response<Law> query();
	
	/**
	 * 
	 * @param law
	 * @return
	 */
	public Response<String> add(Law law);
} 
