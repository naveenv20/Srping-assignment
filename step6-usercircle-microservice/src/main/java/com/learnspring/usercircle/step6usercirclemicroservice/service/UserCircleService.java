package com.learnspring.usercircle.step6usercirclemicroservice.service;

import java.util.List;

import com.learnspring.usercircle.step6usercirclemicroservice.entity.user_circle;



public interface UserCircleService {
	
	
public List<user_circle> findAll();
	
	public user_circle findById(int theId);
	
	public void save(user_circle theuser);
	
	
	public void deleteById(int theId);


}
