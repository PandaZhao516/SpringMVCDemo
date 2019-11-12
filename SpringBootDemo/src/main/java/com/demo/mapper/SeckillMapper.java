/**

*@description TODO
*@author Panda

 */
package com.demo.mapper;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.demo.entity.Seckill;

/**
 * @description 
 * @author zhaoyaping
 *
 * @date 2019年11月12日
 */
@Mapper
public interface SeckillMapper {
	
	/**
	 * 查询所有秒杀商品的信息
	 */
	List<Seckill> findAll();
	
	/**
	 * 根据主键查询所秒杀的商品信息
	 */
	Seckill findById(long id);
	
	/**
     * 减库存。
     * 对于Mapper映射接口方法中存在多个参数的要加@Param()注解标识字段名称，不然Mybatis不能识别出来哪个字段相互对应
     *
     * @param seckillId 秒杀商品ID
     * @param killTime  秒杀时间
     * @return 返回此SQL更新的记录数，如果>=1表示更新成功
     */
	int reduceStock(@Param("seckillId") long seckillId,@Param("killTime") Date killTime);
}
