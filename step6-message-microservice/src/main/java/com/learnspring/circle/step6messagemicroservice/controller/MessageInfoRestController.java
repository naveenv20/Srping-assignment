package com.learnspring.circle.step6messagemicroservice.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.learnspring.circle.step6messagemicroservice.entity.message_info;
import com.learnspring.circle.step6messagemicroservice.entity.messageinfobean;
import com.learnspring.circle.step6messagemicroservice.entity.user_info;
import com.learnspring.circle.step6messagemicroservice.service.messageinboxService;



@RestController
@RequestMapping("/api")
public class MessageInfoRestController {
	
	
	private messageinboxService messageInboxService;
	
	@Autowired
	UserServiceProxy userServiceProxy;
	
	@Autowired
	public MessageInfoRestController(messageinboxService themessageInboxService){
		messageInboxService=themessageInboxService;
	}
	
	
	
	
@RequestMapping("/messageinfo")
	
	public List<message_info> getmessages(Model theModel){
		
		return messageInboxService.getmessagedata();
	}
	
	
@RequestMapping("/messageinfobeans")
	
	public List<messageinfobean> getmessagebean(Model theModel){
		
		List<message_info> themessages = messageInboxService.getmessagedata();
		
		List<messageinfobean> themessagesbeans= new ArrayList<>();
		
		for (message_info c:themessages) {
			
		user_info sender=	userServiceProxy.retrieveUser(c.getSenderId());
		user_info receiver=	userServiceProxy.retrieveUser(c.getReceiver_id());
			
		messageinfobean cb= new messageinfobean(c, sender, receiver);
		themessagesbeans.add(cb);
		}
		
		
		
//		 return userRating.getRatings().stream()
//	                .map(rating -> {
//	                    Movie movie = restTemplate.getForObject("http://movie-info-service/movies/" + rating.getMovieId(), Movie.class);
//	                    return new CatalogItem(movie.getName(), movie.getDescription(), rating.getRating());
//	                })
//	                .collect(Collectors.toList());
		
		
		
		
		// add the customers to the model
		theModel.addAttribute("circlelist", themessagesbeans);
		
		//return "list-users";
		
		
		
		return themessagesbeans;
	}
	
//@RequestMapping("/messageinfo/senders")
//	
//	public List<user_info> getsenders(Model theModel){
//		
//		return messageInboxService.getsenders();
//	}	
//	
//	
//@RequestMapping("/messageinfo/receivers")
//	
//	public List<user_info> getreceivers(Model theModel){
//		
//		return messageInboxService.getreceivers();
//	}
//
//@RequestMapping("/messageinfo/circles")
//	
//	public List<circle> getcircles(Model theModel){
//		
//		return messageInboxService.getcircles();
//	}
	

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
