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
 * @date 2019��12��9��
 */
public class User implements Serializable{
	//�û�id
    private Long id;
    //�û���¼��
    private String username;
    //�û�����
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
