package com.luv2code.springboot.thymeleafdemo.service;

import java.util.List;


import org.springframework.stereotype.Service;


import com.luv2code.springboot.thymeleafdemo.dao.TesttbDAO;
import com.luv2code.springboot.thymeleafdemo.entity.circle;
import com.luv2code.springboot.thymeleafdemo.entity.message_info;
import com.luv2code.springboot.thymeleafdemo.entity.user_inbox;
import com.luv2code.springboot.thymeleafdemo.entity.user_info;




@Service
public class TesttbserviceImpl implements Testtbservice {

	
	private TesttbDAO testtbDAO;
	
	public TesttbserviceImpl (TesttbDAO thetesttbDAO) {
		testtbDAO=thetesttbDAO;
	}
	
	

	@Override
	public List<circle> getCircledata() {
		// TODO Auto-generated method stub
		return testtbDAO.getCircledata();
	}



	@Override
	public List<user_info> getUserdata() {
		// TODO Auto-generated method stub
		return testtbDAO.getUserdata();
	}



	@Override
	public List<message_info> getMessagedata() {
		// TODO Auto-generated method stub
		return testtbDAO.getMessagedata();
	}



	@Override
	public List<user_inbox> getinboxdata() {
		// TODO Auto-generated method stub
		return testtbDAO.getinboxdata();
	}

}
