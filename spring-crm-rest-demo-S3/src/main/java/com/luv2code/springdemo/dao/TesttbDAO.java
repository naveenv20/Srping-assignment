package com.luv2code.springdemo.dao;

import java.util.List;

import com.luv2code.springdemo.entity.circle;
import com.luv2code.springdemo.entity.message_info;
import com.luv2code.springdemo.entity.user_inbox;
import com.luv2code.springdemo.entity.user_info;





public interface TesttbDAO {
	
	


	public List<circle> getCircledata();
	
	public List<user_info> getUserdata();

	public List<message_info> getMessagedata();

	public List<user_inbox> getinboxdata();

}
