package com.luv2code.springdemo.service;

import java.util.List;

import com.luv2code.springdemo.model.user_circle;



public interface usercircleService {
	
	public List<user_circle> getcircleuserdata(int circleId);
	
	public List<user_circle> getusercircledata(int userId);

	public void saveUserCircle(user_circle theUserCircle);
	

}
