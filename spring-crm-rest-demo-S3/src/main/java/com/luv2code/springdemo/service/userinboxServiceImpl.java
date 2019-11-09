package com.luv2code.springdemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.luv2code.springdemo.dao.userinboxDAO;
import com.luv2code.springdemo.entity.user_inbox;

@Service
public class userinboxServiceImpl implements userinboxService {

	@Autowired
	private userinboxDAO userInboxDAO;
	
	
	
	@Override
	@Transactional
	public List<user_inbox> getinboxdata(int receiverId) {
		
		return userInboxDAO.getinboxdata(receiverId);
	}

}
