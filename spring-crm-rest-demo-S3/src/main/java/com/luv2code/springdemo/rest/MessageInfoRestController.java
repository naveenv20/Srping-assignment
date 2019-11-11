package com.luv2code.springdemo.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.luv2code.springdemo.entity.circle;
import com.luv2code.springdemo.entity.message_info;
import com.luv2code.springdemo.entity.user_inbox;
import com.luv2code.springdemo.entity.user_info;
import com.luv2code.springdemo.service.messageinboxService;
import com.luv2code.springdemo.service.userinboxService;

@RestController
@RequestMapping("/api")
public class MessageInfoRestController {
	
	@Autowired
	private messageinboxService messageInboxService;
	
	
@RequestMapping("/messageinfo")
	
	public List<message_info> getcirclesusers(Model theModel){
		
		return messageInboxService.getmessagedata();
	}
	
@RequestMapping("/messageinfo/senders")
	
	public List<user_info> getsenders(Model theModel){
		
		return messageInboxService.getsenders();
	}	
	
	
@RequestMapping("/messageinfo/receivers")
	
	public List<user_info> getreceivers(Model theModel){
		
		return messageInboxService.getreceivers();
	}

@RequestMapping("/messageinfo/circles")
	
	public List<circle> getcircles(Model theModel){
		
		return messageInboxService.getcircles();
	}
	

	@RequestMapping("/messageinfo/{messageId}")
	public message_info getcustomer(@PathVariable int messageId ){
			
		message_info themessage_info=messageInboxService.getmessageinfo(messageId);
		
	return themessage_info;
		
	}
	
	
	@PostMapping("/messageinfo")
	public message_info addUser(@RequestBody message_info themessage_info){
		
		
		//also just in the case the pass the id in JSON ...set id to 0
		//this is force a save of new item .. instead of doing update 
		messageInboxService.savemessage(themessage_info);
		return themessage_info;
		
	}
	
	
}
