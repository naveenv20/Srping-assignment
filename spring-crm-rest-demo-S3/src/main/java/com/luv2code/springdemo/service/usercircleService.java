package com.luv2code.springdemo.service;

import java.util.List;

import com.luv2code.springdemo.entity.circle;
import com.luv2code.springdemo.entity.user_circle;

public interface usercircleService {
	
	public List<user_circle> getusercircledata(int circleId);
	
	public List<user_circle> getusercircledata2(int userId);

	public void saveUserCircle(user_circle theUserCircle);
	
	public circle getCircle(int circleId);
	

}
