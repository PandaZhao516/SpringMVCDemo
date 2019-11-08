/**

*@description TODO
*@author Panda

 */
package com.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.entity.User;
import com.demo.mapper.UserMapper;
import com.demo.service.UserService;

/**
 * @description 
 * @author zhaoyaping
 *
 * @date 2019年11月7日
 */
@Service
public class UserServiceImpl implements UserService{

	@Autowired
    private UserMapper userMapper;
	
	/* (non-Javadoc)
	 * @see com.demo.service.BaseService#findAll()
	 */
	@Override
	public List<User> findAll() {
		// TODO Auto-generated method stub
		List<User> users =  userMapper.findAll();
		for(User u:users){
			
		}
		return users;
	}

	/* (non-Javadoc)
	 * @see com.demo.service.BaseService#findById(java.lang.Long)
	 */
	@Override
	public List<User> findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.demo.service.BaseService#create(java.lang.Object)
	 */
	@Override
	public void create(User t) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.demo.service.BaseService#delete(java.lang.Long[])
	 */
	@Override
	public void delete(Long... ids) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.demo.service.BaseService#update(java.lang.Object)
	 */
	@Override
	public void update(User t) {
		// TODO Auto-generated method stub
		
	}

}
