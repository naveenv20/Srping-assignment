package com.luv2code.springboot.thymeleafdemo.dao;

import java.util.List;

import com.luv2code.springboot.thymeleafdemo.entity.circle;
import com.luv2code.springboot.thymeleafdemo.entity.user_info;



public interface TesttbDAO {
	
	


	public List<circle> getCircledata();
	
	public List<user_info> getUserdata();

}
