/**

*@description TODO
*@author Panda

 */
package com.springmvc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springmvc.mapper.UserMapper;
import com.springmvc.pojo.User;
import com.springmvc.service.UserService;

/**
 * @description 
 * @author zhaoyaping
 *
 * @date 2019年12月9日
 */

@Service
public class UserServiceImpl implements UserService{
	
	 //注入
    @Autowired
    private UserMapper userMapper;

    
    /**
     * 用户登录的方法
     */
    public User login(String username) {
        return userMapper.login(username);
    }
    
	/* (non-Javadoc)
	 * @see com.springmvc.service.BaseService#findAll()
	 */
	@Override
	public List<User> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.springmvc.service.BaseService#findById(java.lang.Long)
	 */
	@Override
	public User findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.springmvc.service.BaseService#create(java.lang.Object)
	 */
	@Override
	public void create(User t) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.springmvc.service.BaseService#delete(java.lang.Long)
	 */
	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.springmvc.service.BaseService#update(java.lang.Object)
	 */
	@Override
	public void update(User t) {
		// TODO Auto-generated method stub
		
	}
}
