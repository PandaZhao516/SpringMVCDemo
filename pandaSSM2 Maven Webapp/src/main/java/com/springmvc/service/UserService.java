/**

*@description TODO
*@author Panda

 */
package com.springmvc.service;

import com.springmvc.pojo.User;

/**
 * @description 
 * @author zhaoyaping
 *
 * @date 2019年12月9日
 */
public interface UserService extends BaseService<User>{
	User login(String username);
}
