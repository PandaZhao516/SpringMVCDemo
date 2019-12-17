/**

*@description TODO
*@author Panda

 */
package com.springmvc.mapper;

import com.springmvc.pojo.Customer;

/**
 * @description 
 * @author zhaoyaping
 *
 * @date 2019年12月10日
 */
public interface CustomerMapper {
	void create(Customer customer);
	void delete(Long id);
}
