package com.luv2code.springdemo.service;

import java.util.List;

import com.luv2code.springdemo.entity.user_inbox;



public interface userinboxService {
	
	
	public List<user_inbox> getinboxdata(int receiverId);

}
