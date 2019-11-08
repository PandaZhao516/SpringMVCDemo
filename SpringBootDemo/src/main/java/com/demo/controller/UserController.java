/**

*@description TODO
*@author Panda

 */
package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.entity.User;
import com.demo.service.UserService;

/**
 * @description 
 * @author zhaoyaping
 *
 * @date 2019年11月7日
 */
@RestController
public class UserController {
	@Autowired
	private UserService userService;
	
	@RequestMapping("/findAll")
	public List<User> findAll(){
	
		List<User> users = userService.findAll();
		return users;
	}
}
