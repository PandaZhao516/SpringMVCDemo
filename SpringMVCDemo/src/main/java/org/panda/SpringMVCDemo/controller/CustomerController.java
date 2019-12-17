/**

*@description TODO
*@author Panda

 */
package org.panda.SpringMVCDemo.controller;

import org.panda.SpringMVCDemo.pojo.Customer;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @description 这是客户管理的Controller层
 * @author zhaoyaping
 *
 * @date 2019年12月4日
 */
@Controller
@RequestMapping(value="/customer")
public class CustomerController {
	/**
	 * 注入service层
	 * 使用@Resource和@Autowired都可以注入
	 */
	
	@RequestMapping(value="/save")
	public String save(Customer customer,Model model){
		
		return null;
	}
	
	@RequestMapping(value="/delete")
	public String delete(@RequestParam int c_id,Model model){
		
		return null;
	}
	
	@ResponseBody
	@RequestMapping(value="/findById")
	public Customer findById(@RequestBody Customer customer){
		
		return null;
	}
	
	@RequestMapping(value="/update")
	public String update(Customer customer,Model model){
		
		return null;
	}
	
}
