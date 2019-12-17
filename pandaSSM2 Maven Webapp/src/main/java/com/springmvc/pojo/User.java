/**

*@description TODO
*@author Panda

 */
package com.springmvc.pojo;

import java.io.Serializable;

/**
 * @description 
 * @author zhaoyaping
 *
 * @date 2019年12月9日
 */
public class User implements Serializable{
	//用户id
    private Long id;
    //用户登录名
    private String username;
    //用户密码
    private String password;
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
