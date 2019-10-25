package com.luv2code.springboot.thymeleafdemo.dao;

import java.util.List;

import com.luv2code.springboot.thymeleafdemo.entity.circle;
import com.luv2code.springboot.thymeleafdemo.entity.message_info;
import com.luv2code.springboot.thymeleafdemo.entity.user_inbox;
import com.luv2code.springboot.thymeleafdemo.entity.user_info;



public interface TesttbDAO {
	
	


	public List<circle> getCircledata();
	
	public List<user_info> getUserdata();

	public List<message_info> getMessagedata();

	public List<user_inbox> getinboxdata();

}
