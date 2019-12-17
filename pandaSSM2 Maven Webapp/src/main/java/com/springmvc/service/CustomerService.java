/**

*@description TODO
*@author Panda

 */
package com.springmvc.service;

import java.util.Map;

import com.springmvc.pojo.Customer;
import com.springmvc.pojo.PageBean;

/**
 * @description 
 * @author zhaoyaping
 *
 * @date 2019年12月10日
 */
public interface CustomerService extends BaseService<Customer>{
	/**
     * 分页查询
     * @param customer 查询条件
     * @param pageCode 当前页
     * @param pageSize 每页的记录数
     * @return
     */
	
 	PageBean findByPage(int pageCode, int pageSize, Map<String, Object> conMap);
}
