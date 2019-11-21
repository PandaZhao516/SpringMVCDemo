/**

*@description TODO
*@author Panda

 */
package com.demo.mapper;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.demo.entity.Seckill;

/**
 * @description 
 * @author zhaoyaping
 *
 * @date 2019年11月20日
 */

@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration("classpath:application.yml")
@ComponentScan(basePackages = {"com.demo"})
@MapperScan("com.demo.mapper")

public class SeckillMapperTest {
	@Autowired
	private SeckillMapper seckillMapper;
	
//	@Autowired
//	private UserMapper userMapper;
	
    @Test
    public void findAll() {
    	List<Seckill> all = seckillMapper.findAll();
    	for(Seckill seckill : all){
    		System.out.println(seckill.getTitle());
    	}
    }

    @Test
    public void findById() {
    }

    @Test
    public void reduceStock() {
    }
}
