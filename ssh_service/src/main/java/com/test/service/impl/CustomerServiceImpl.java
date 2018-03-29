package com.test.service.impl;

import java.util.List;

import com.test.dao.CustomerDao;
import com.test.domain.Customer;
import com.test.service.CustomerService;

public class CustomerServiceImpl implements CustomerService {

	private CustomerDao customerDao;
	public void setCustomerDao(CustomerDao customerDao) {
		this.customerDao = customerDao;
	}
	
	/**
	 * 查找所有
	 */
	public List<Customer> findAll(){
		return customerDao.findAll(); 
	}
}
