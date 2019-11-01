package com.luv2code.springdemo.dao;

import java.util.List;

import com.luv2code.springdemo.entity.circle;


public interface circleDAO {
	
	
	
	public List<circle> getCircledata();
	
	
	public circle getCircle(int theId);

	public void deleteCircle(int theId);

	public void saveCircle(circle theUser);

}
