package com.cazamundo.harry.security.dao.model;

public class DbUser {

	/**
	 * The userName
	 */
	private String userName;

	/**
	 * The password as an MD5 value
	 */
	private String password;

	/**
	 * Access level of the user. 1 = Admin user 2 = Regular user
	 */
	private Integer access;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Integer getAccess() {
		return access;
	}

	public void setAccess(Integer access) {
		this.access = access;
	}

}
