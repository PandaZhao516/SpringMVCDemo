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
public class Customer implements Serializable{
	//�ͻ���id
    private Long id;
    //�ͻ�������
    private String name;
    //�ͻ��ĵ绰
    private String telephone;
    //�ͻ���סַ
    private String address;
    //�ͻ���ע
    private String remark;
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
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the telephone
	 */
	public String getTelephone() {
		return telephone;
	}
	/**
	 * @param telephone the telephone to set
	 */
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}
	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	/**
	 * @return the remark
	 */
	public String getRemark() {
		return remark;
	}
	/**
	 * @param remark the remark to set
	 */
	public void setRemark(String remark) {
		this.remark = remark;
	}
    
    
}
