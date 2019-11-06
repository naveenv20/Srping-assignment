package com.luv2code.springdemo.service;

import java.util.List;

import com.luv2code.springdemo.model.circle;
import com.luv2code.springdemo.model.user_circle;



public interface usercircleService {
	
	public List<user_circle> getcircleuserdata(int circleId);
	
	public List<user_circle> getusercircledata(int userId);

	public void saveUserCircle(user_circle theUserCircle);
	
<<<<<<< HEAD
	public circle getcircle(int circleId);
=======
	public circle getCircle(int theId);
>>>>>>> 3cdd1126326ce08ee61ee9ee711b0a94ca7c297c
	

}
