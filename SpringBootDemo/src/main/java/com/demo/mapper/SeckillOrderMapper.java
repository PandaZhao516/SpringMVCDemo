/**

*@description TODO
*@author Panda

 */
package com.demo.mapper;

import java.math.BigDecimal;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.demo.entity.SeckillOrder;

/**
 * @description 
 * @author zhaoyaping
 *
 * @date 2019年11月12日
 */
@Mapper
public interface SeckillOrderMapper {
	
	/**
	 * 插入购买订单明细
	 */
	int insertOrder(@Param("seckillId") long seckillId,@Param("money") BigDecimal money,@Param("userPhone") long userPhone);
	
	/**
	 * 根据秒杀商品ID查询订单明细数据并得到对应秒杀商品的详细数据，因为在订单里我们已经定义了一个秒杀商品的对象
	 */
	SeckillOrder findById(@Param("seckillId") long seckillId,@Param("userPhone") long userPhone);
}
