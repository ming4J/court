package com.court.bean;

/**
 * 
 * @author zJay~
 *
 */
public class User {
	
	private String serialkey;

	private String username;
	
	private String password;
	
	private String email;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSerialkey() {
		return serialkey;
	}

	public void setSerialkey(String serialkey) {
		this.serialkey = serialkey;
	}

	@Override
	public String toString() {
		return "User{" +
				"serialkey='" + serialkey + '\'' +
				", username='" + username + '\'' +
				", password='" + password + '\'' +
				", email='" + email + '\'' +
				'}';
	}
}
