/**

*@description TODO
*@author Panda

 */
package com.demo.entity;

import java.io.Serializable;

/**
 * @description 
 * @author zhaoyaping
 *
 * @date 2019年11月7日
 */
public class User implements Serializable{
	private Long id; //编号
    private String username; //用户名
    private String password; //密码
	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}
	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
}
