/**

*@description TODO
*@author Panda

 */
package com.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
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
	 @GetMapping(value={"/","/index"})
	    public String index(){
	        return "home/index";
	 }
}
