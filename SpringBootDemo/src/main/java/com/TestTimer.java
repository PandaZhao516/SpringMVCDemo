/**

*@description TODO
*@author Panda

 */
package com;

import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;

/**
 * @description 
 * @author zhaoyaping
 *1.创建一个能被定时任务类，方法上加入@Scheduled注解
 * @date 2019年11月4日
 */
public class TestTimer {
	 @Scheduled(cron = "0/1 * * * * ?")
	 private void test(){
		 System.out.println("执行定时任务的时间是："+new Date());
	 }
}
