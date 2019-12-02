package com.learnspring.circle.step6circlemicroservice.service;

import java.util.List;

import com.learnspring.circle.step6circlemicroservice.entity.circle;



public interface CircleService {
	
public List<circle> findAll();
	
	public circle findById(int theId);
	
	public void save(circle theuser);
	
	
	public void deleteById(int theId);

}
