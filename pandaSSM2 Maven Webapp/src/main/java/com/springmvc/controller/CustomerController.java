/**

*@description TODO
*@author Panda

 */
package com.springmvc.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.springmvc.pojo.Customer;
import com.springmvc.service.CustomerService;

/**
 * @description 这是用户管理的Controller层
 * @author zhaoyaping
 *
 * @date 2019年12月10日
 */

@Controller
@RequestMapping(value="/customer")
public class CustomerController {
	
	/**
	 * 注入Service层
	 * 使用@Resource和@Autowired都可以实现Bean的自动注入
	 */
	@Autowired
    private CustomerService customerService;
	
	/**
     * 跳转到添加客户功能页面
     */
    @RequestMapping("/toSavePage")
    public String toSavePage() {
        return "page/save";
    }
	
    /**
     * 跳转到客户列表页面
     */
    @RequestMapping(value = "/toListPage")
    public String toListPage(Model model) {
        return "redirect:findByPage.do";
    }
    
	/**
	 * 客户信息保存
	 */
	@RequestMapping(value = "/save")
	public String create(Customer customer,Model model){
		try{
			customerService.create(customer);
			model.addAttribute("message", "保存信息成功!");
		}catch(Exception e){
			e.printStackTrace();
		}
		return "page/info";
	}
	
	/**
	 * 客户信息删除
	 * @param c_id
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/delete")
	public String delete(@RequestParam Long c_id,Model model){
		try{
			customerService.delete(c_id);
			model.addAttribute("message", "删除客户信息成功");
		}catch(Exception e){
			e.printStackTrace();
		}
		return "page/info";
	}
	
	/**
	 * 分页查询
	 */
	 @RequestMapping("/findByPage")
	 public String findByPage(Customer customer,
			 @RequestParam(value = "pageCode", required = false, defaultValue = "1") int pageCode,
			 @RequestParam(value = "pageSize", required = false, defaultValue = "2") int pageSize,
			 HttpServletRequest request,
			 Model model){
		 
		 // 封装分页数据
		 String c_name = request.getParameter("c_name");
		 String c_telephone = request.getParameter("c_telephone");
		 Map<String,Object> conMap = new HashMap<String,Object>();
		 conMap.put("c_name",c_name);
		 conMap.put("c_telephone",c_telephone);
		 
		 
		 //回显数据
		 model.addAttribute("page", customerService.findByPage(pageCode, pageSize,conMap));
		 return "page/list";
	 }
}
