/**

*@description TODO
*@author Panda

 */
package com.springmvc.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springmvc.mapper.CustomerMapper;
import com.springmvc.pojo.Customer;
import com.springmvc.pojo.PageBean;
import com.springmvc.service.CustomerService;

/**
 * @description 客户的service层
 * @author zhaoyaping
 *
 * @date 2019年12月10日
 */
@Service
public class CustomerServiceImpl implements CustomerService{
	
	//注入
	@Autowired
	private CustomerMapper customerMapper;
	

	/* (non-Javadoc)
	 * @see com.springmvc.service.BaseService#findAll()
	 */
	@Override
	public List<Customer> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.springmvc.service.BaseService#findById(java.lang.Long)
	 */
	@Override
	public Customer findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.springmvc.service.BaseService#create(java.lang.Object)
	 */
	@Override
	public void create(Customer customer) {
		// TODO Auto-generated method stub
		customerMapper.create(customer);
	}

	/* (non-Javadoc)
	 * @see com.springmvc.service.BaseService#delete(java.lang.Long)
	 */
	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		customerMapper.delete(id);;
	}

	/* (non-Javadoc)
	 * @see com.springmvc.service.BaseService#update(java.lang.Object)
	 */
	@Override
	public void update(Customer t) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.springmvc.service.CustomerService#findByPage(com.springmvc.pojo.Customer, int, int)
	 */
	@Override
	public PageBean<Customer> findByPage(int pageCode, int pageSize, Map<String, Object> conMap) {
		// TODO Auto-generated method stub
		HashMap<String,Object> map = new HashMap<String,Object>();
		PageBean<Customer> pageBean = new PageBean<Customer>();
		
		//封装当前页
		pageBean.setPageCode(pageCode);
		pageBean.setPageSize(pageSize);
		
		//封装总记录数（从数据库中查询）
	//	int totalCount = customerMapper.selectCount();
	//	System.out.println("查询到的总数是"+totalCount);
		
		return null;
	}

}
