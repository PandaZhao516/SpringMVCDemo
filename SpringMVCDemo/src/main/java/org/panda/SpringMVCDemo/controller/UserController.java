/**

*@description TODO
*@author Panda

 */
package org.panda.SpringMVCDemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @description 用户的控制层
 * @author zhaoyaping
 *
 * @date 2019年12月4日
 */
@Controller
@RequestMapping("/user")
public class UserController {
	//注入service

	/**
	 * 用户登陆
	 */
	@RequestMapping(value = "/login")
	public String login(@RequestParam String username,@RequestParam String password,Model model){
	
		return null;
	}
}
