package com.luv2code.springdemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.luv2code.springdemo.dao.MessageInfoRepository;
import com.luv2code.springdemo.entity.circle;
import com.luv2code.springdemo.entity.message_info;
import com.luv2code.springdemo.entity.user_info;

@Service
public class messageinboxServiceImpl implements messageinboxService {
	
	@Autowired
	private MessageInfoRepository messageInfoDAO;

	@Override
	@Transactional
	public List<message_info> getmessagedata() {
		return messageInfoDAO.getmessagedata();
	
	}

	@Override
	@Transactional
	public List<user_info> getsenders() {
		// TODO Auto-generated method stub
		return messageInfoDAO.getsenders();
	}

	@Override
	@Transactional
	public List<user_info> getreceivers() {
		// TODO Auto-generated method stub
		return messageInfoDAO.getreceivers();
	}

	@Override
	@Transactional
	public List<circle> getcircles() {
		// TODO Auto-generated method stub
		return messageInfoDAO.getcircles();
	}

	@Override
	@Transactional
	public void savemessage(message_info themessage_info) {
		messageInfoDAO.savemessage(themessage_info);
		
	}

	@Override
	@Transactional
	public message_info getmessageinfo(int theId) {
		
		return messageInfoDAO.getmessageinfo(theId);
	}

}
