package com.luv2code.springdemo.service;

import java.util.List;

import com.luv2code.springdemo.model.user_info;

public interface CustomerService {

	public List<user_info> getCustomers();

	public void saveCustomer(user_info theCustomer);

	public user_info getCustomer(int theId);

	public void deleteCustomer(int theId);
	
}
