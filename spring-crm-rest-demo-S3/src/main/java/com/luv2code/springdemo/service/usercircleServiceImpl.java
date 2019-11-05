package com.luv2code.springdemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.luv2code.springdemo.dao.usercircleDAO;
import com.luv2code.springdemo.entity.user_circle;

@Service
public class usercircleServiceImpl implements usercircleService {

	@Autowired
	usercircleDAO UserCircleDAO;
	
	@Override
	@Transactional
	public List<user_circle> getusercircledata(int circleId) {
		// TODO Auto-generated method stub
		return UserCircleDAO.getusercircledata(circleId);
	}

	@Override
	@Transactional
	public List<user_circle> getusercircledata2(int userId) {
		// TODO Auto-generated method stub
		return UserCircleDAO.getusercircledata2(userId);
	}

	@Override
	public void saveUserCircle(user_circle theUserCircle) {
		
		UserCircleDAO.saveUserCircle(theUserCircle);
	}

}
