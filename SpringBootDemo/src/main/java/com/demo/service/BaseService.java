/**

*@description TODO
*@author Panda

 */
package com.demo.service;

import java.util.List;

/**
 * @description 
 * @author zhaoyaping
 *
 * @date 2019年11月7日
 */
public interface BaseService<T> {
	//查询所有
	List<T> findAll();
	
	//根据ID查询
	List<T> findById(Long id);
	
	//添加
	void create(T t);
	
	//删除（批量）
	void delete(Long... ids);
	
	//修改
	void update(T t);
}
