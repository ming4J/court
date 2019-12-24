package com.court.bean;

import java.util.Date;

/**
 * 
 * @author zJay~
 *
 */
public class Law {

	private String serialkey;
	
	private String lawtit;
	
	private Date lawdate;
	
	private String lawlink;

	public String getSerialkey() {
		return serialkey;
	}

	public void setSerialkey(String serialkey) {
		this.serialkey = serialkey;
	}

	public String getLawtit() {
		return lawtit;
	}

	public void setLawtit(String lawtit) {
		this.lawtit = lawtit;
	}

	public Date getLawdate() {
		return lawdate;
	}

	public void setLawdate(Date lawdate) {
		this.lawdate = lawdate;
	}

	public String getLawlink() {
		return lawlink;
	}

	public void setLawlink(String lawlink) {
		this.lawlink = lawlink;
	}
	
	
}
