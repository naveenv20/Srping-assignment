package com.luv2code.springdemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.luv2code.springdemo.dao.usercircleDAO;
import com.luv2code.springdemo.entity.circle;
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
	@Transactional
	public void saveUserCircle(user_circle theUserCircle) {
		System.out.println("@@@@@@@");
		UserCircleDAO.saveUserCircle(theUserCircle);
	}

	@Override
	@Transactional
	public circle getCircle(int circleId) {
		// TODO Auto-generated method stub
		return UserCircleDAO.getCircle(circleId);
	}

	@Override
	@Transactional
	public void deleteCircle(int usercircleId) {
	
		UserCircleDAO.deleteCircle(usercircleId);
		
	}

	@Override
	@Transactional
	public user_circle getcircleuser(int usercircleId) {
		// TODO Auto-generated method stub
		return UserCircleDAO.getcircleuser(usercircleId);
	}

}
