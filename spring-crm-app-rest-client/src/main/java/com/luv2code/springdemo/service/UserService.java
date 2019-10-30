package com.luv2code.springdemo.service;

import java.util.List;

import com.luv2code.springdemo.model.user_info;

public interface UserService {

	public List<user_info> getUsers();

	public void saveUser(user_info theUser);

	public user_info getUser(int theId);

	public void deleteUser(int theId);
	
}

