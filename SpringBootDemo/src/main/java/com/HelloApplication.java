package com;
/**

*@description TODO
*@author Panda

 */


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @description 
 * @author zhaoyaping
 *
 * @date 2019年10月24日
 */
@SpringBootApplication
@EnableScheduling
public class HelloApplication {
    // 在main方法中启动一个应用，即：这个应用的入口
    public static void main(String[] args) {
        SpringApplication.run(HelloApplication.class, args);
    }
}
