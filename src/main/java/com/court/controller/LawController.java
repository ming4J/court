package com.court.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.court.bean.Law;
import com.court.bean.Response;
import com.court.services.LawServices;

/**
 * 
 * @author zJay~
 *
 */
@RestController
@RequestMapping(value="/law")
public class LawController {

	@Autowired
	private LawServices lawServices;
	
	/**
	 * 
	 * @param user
	 * @return
	 */
	@RequestMapping(value="/query",method=RequestMethod.GET)
    @ResponseBody
	public Response<Law> query() {
		return lawServices.query();
	}
	
	/**
	 * 
	 * @param law
	 * @return
	 */
	@RequestMapping(value="/add",method=RequestMethod.POST)
    @ResponseBody
	public Response<String> add(@RequestBody Law law) {
		return lawServices.add(law);
	}
}
