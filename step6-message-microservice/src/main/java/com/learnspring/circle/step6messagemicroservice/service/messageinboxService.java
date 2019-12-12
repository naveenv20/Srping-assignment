package com.learnspring.circle.step6messagemicroservice.service;

import java.util.List;

import com.learnspring.circle.step6messagemicroservice.entity.message_info;
import com.learnspring.circle.step6messagemicroservice.entity.user_info;





public interface messageinboxService {
	
	
	public List<message_info> getmessagedata();
	

	
public void savemessage(message_info themessage_info);
	
	public message_info getmessageinfo(int theId);



	void deleteById(int theId);
	

}
