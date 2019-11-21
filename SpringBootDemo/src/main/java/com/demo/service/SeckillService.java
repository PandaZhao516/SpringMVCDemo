/**

*@description TODO
*@author Panda

 */
package com.demo.service;

import java.math.BigDecimal;
import java.util.List;

import com.demo.dto.Exposer;
import com.demo.entity.Seckill;

/**
 * @description 
 * @author zhaoyaping
 *
 * @date 2019年11月20日
 */
public interface SeckillService {
	/**
	 * 获取所有的秒杀商品列表
	 */
	List<Seckill> findAll();
	
	/**
	 * 获取某一条商品秒杀信息
	 */
	Seckill findById(long seckillId);
	
	/**
	 * 秒杀开始时，暴露出秒杀的地址
	 * 否则输出系统时间与秒杀时间
	 */
	Exposer exportSeckillUrl(long seckillId);
	
	/**
	 * 执行秒杀的操作
	 */
	SeckillExection executeSeckill(long seckillId, BigDecimal money, long userPhone, String md5)throws SeckillException, RepeatKillException, SeckillCloseException;
}
