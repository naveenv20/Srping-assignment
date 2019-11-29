package com.learnspring.user.step6usermicroservice.service;

import java.util.List;

import com.learnspring.user.step6usermicroservice.entity.user_info;



public interface UserService {
	
	
public List<user_info> findAll();
	
	public user_info findById(int theId);
	
	public void save(user_info theuser);
	
	
	public void deleteById(int theId);

}
