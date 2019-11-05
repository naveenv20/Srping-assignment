package com.luv2code.springdemo.dao;

import java.util.List;

import com.luv2code.springdemo.entity.circle;
import com.luv2code.springdemo.entity.user_circle;


public interface usercircleDAO {
	
	
	
	public List<user_circle> getusercircledata(int circleId);
	
	public List<user_circle> getusercircledata2(int userId);

	public void saveUserCircle(user_circle theUserCircle);
	
}
