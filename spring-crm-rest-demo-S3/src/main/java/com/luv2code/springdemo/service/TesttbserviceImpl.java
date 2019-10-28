package com.luv2code.springdemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.luv2code.springdemo.dao.TesttbDAO;
import com.luv2code.springdemo.entity.circle;
import com.luv2code.springdemo.entity.message_info;
import com.luv2code.springdemo.entity.user_inbox;
import com.luv2code.springdemo.entity.user_info;


@Service
public class TesttbserviceImpl implements Testtbservice {

	@Autowired
	private TesttbDAO testtbDAO;
	
	
	
	

	@Override
	@Transactional
	public List<circle> getCircledata() {
		// TODO Auto-generated method stub
		return testtbDAO.getCircledata();
	}



	@Override
	@Transactional
	public List<user_info> getUserdata() {
		// TODO Auto-generated method stub
		return testtbDAO.getUserdata();
	}



	@Override
	@Transactional
	public List<message_info> getMessagedata() {
		// TODO Auto-generated method stub
		return testtbDAO.getMessagedata();
	}



	@Override
	@Transactional
	public List<user_inbox> getinboxdata() {
		// TODO Auto-generated method stub
		return testtbDAO.getinboxdata();
	}



	@Override
	@Transactional
	public user_info getuser(int theId) {
		// TODO Auto-generated method stub
		return testtbDAO.getuser(theId);
	}



	@Override
	@Transactional
	public void deleteUser(int theId) {
		 testtbDAO.deleteUser(theId);
		
	}



	@Override
	@Transactional
	public void saveUser(user_info theUser) {
		testtbDAO.saveUser(theUser);
		
	}

}
