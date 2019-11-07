/**

*@description TODO
*@author Panda

 */
package com.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description 
 * @author zhaoyaping
 *
 * @date 2019年11月4日
 */
@RestController
public class IndexController {
	 @RequestMapping("/")
	    public String index(){
	        return "hi Panda";
	 }
}
