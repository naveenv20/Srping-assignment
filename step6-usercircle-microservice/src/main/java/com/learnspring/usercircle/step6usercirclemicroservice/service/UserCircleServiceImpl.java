package com.learnspring.usercircle.step6usercirclemicroservice.service;

import java.util.List;
import java.util.Optional;

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
		return UserCircleRepository.findAll();
	}

	@Override
	public user_circle findById(int theId) {
		
		
		Optional<user_circle> result=UserCircleRepository.findById(theId);
		user_circle theusercircle=null;
		if(result.isPresent()){
			theusercircle=result.get();
		}
		
		else {
			throw new RuntimeException("Not found the UserCircle with id : "+theId);
		}
		
		
		return theusercircle;
		
		
	}

	@Override
	public void save(user_circle theusercircle) {
		UserCircleRepository.save(theusercircle);

	}

	@Override
	public void deleteById(int theId) {
		UserCircleRepository.deleteById(theId);

	}

}
