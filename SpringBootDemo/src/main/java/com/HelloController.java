/**

*@description TODO
*@author Panda

 */
package com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description 
 * @author zhaoyaping
 *
 * @date 2019年10月24日
 */

@RestController
public class HelloController {
//	// 获取.yml 文件中值
//	@Value("${name}")
//	private String name;
//	
//	//获取url
//	@Value("${GithubUrl}")
//	private String url;
//	
//	//获取content
//	@Value("${content}")
//	private String content;
	
	 @Autowired
	 private Author author;
	
	//路径映射，对应浏览器访问的地址，访问该路径则执行下面函数
	@RequestMapping("/hello")
	public String hello() {
        return author.getName() + " CSDN 博客："+ author.getGithubUrl();
    }
}
