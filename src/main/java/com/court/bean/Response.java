package com.court.bean;

import java.util.List;

public class Response <T>{

	private String code = "200";
	
	private String desc = "SUCCESS";
	
	private List<T> list;
	
	private T bean;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public List<T> getList() {
		return list;
	}

	public void setList(List<T> list) {
		this.list = list;
	}

	public T getBean() {
		return bean;
	}

	public void setBean(T bean) {
		this.bean = bean;
	}
	
	
}
