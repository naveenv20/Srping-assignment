package com.luv2code.springdemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import com.luv2code.springdemo.dao.circleDAO;
import com.luv2code.springdemo.entity.circle;

@Service
public class circleServiceImpl implements circleService {
	
	
	@Autowired
	private circleDAO circledao;
	
	

	@Override
	@Transactional
	public List<circle> getCircledata() {
		return circledao.getCircledata();
	}

	@Override
	@Transactional
	public circle getCircle(int theId) {
		// TODO Auto-generated method stub
		return circledao.getCircle(theId);
	}

	@Override
	@Transactional
	public void deleteCircle(int theId) {
		
		circledao.deleteCircle(theId);
		
	}

	@Override
	@Transactional
	public void saveCircle(circle theUser) {
		circledao.saveCircle(theUser);
		
	}

}
