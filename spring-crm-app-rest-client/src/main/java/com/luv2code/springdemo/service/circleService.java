package com.luv2code.springdemo.service;

import java.util.List;

import com.luv2code.springdemo.model.circle;



public interface circleService {
	
public List<circle> getCircledata();
	
	
	public circle getCircle(int theId);

	public void deleteCircle(int theId);

	public void saveCircle(circle theCircle);

}
