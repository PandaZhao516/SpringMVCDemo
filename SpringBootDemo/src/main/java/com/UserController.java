/**

*@description TODO
*@author Panda

 */
package com;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import pojo.User;

/**
 * @description 
 * @author zhaoyaping
 *
 * @date 2019年11月4日
 */
@RestController
public class UserController {
	@GetMapping(value = "/json",produces = MediaType.APPLICATION_JSON_VALUE)
	public User index(){
		User user = new User("Panda","27","西安");
		return user;
	}
	
	@GetMapping(value = "/xml",produces = MediaType.APPLICATION_XML_VALUE)
	public User XML(){
		User user = new User("Panda", "26", "北京");
        return user;
	}
}
