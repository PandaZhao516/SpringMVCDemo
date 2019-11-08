/**

*@description TODO
*@author Panda

 */
package com.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.demo.entity.User;

/**
 * @description 
 * @author zhaoyaping
 *
 * @date 2019年11月7日
 */
@Mapper
public interface UserMapper {
	List<User> findAll();
}
