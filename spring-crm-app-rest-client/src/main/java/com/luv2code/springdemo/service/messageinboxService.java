package com.luv2code.springdemo.service;

import java.util.List;

import com.luv2code.springdemo.model.circle;
import com.luv2code.springdemo.model.message_info;
import com.luv2code.springdemo.model.user_info;





public interface messageinboxService {
	
	
	public List<message_info> getmessagedata();
	
public List<user_info> getsenders();
	
	public List<user_info> getreceivers();
	
	public List<circle> getcircles();
	
public void savemessage(message_info themessage_info);
	
	public message_info getmessageinfo(int theId);

}
