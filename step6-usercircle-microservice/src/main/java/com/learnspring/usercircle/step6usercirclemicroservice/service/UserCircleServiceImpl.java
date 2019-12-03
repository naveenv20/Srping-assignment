package com.learnspring.usercircle.step6usercirclemicroservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learnspring.usercircle.step6usercirclemicroservice.dao.UserCircleRepository;
import com.learnspring.usercircle.step6usercirclemicroservice.entity.user_circle;


@Service
public class UserCircleServiceImpl implements UserCircleService {

	private UserCircleRepository UserCircleRepository;
	
	@Autowired
	public UserCircleServiceImpl (UserCircleRepository theUserCircleRepository) {
		UserCircleRepository=theUserCircleRepository;
	}
	
	
	
	@Override
	public List<user_circle> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public user_circle findById(int theId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void save(user_circle theuser) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteById(int theId) {
		// TODO Auto-generated method stub

	}

}
