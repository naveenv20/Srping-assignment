package com.learnspring.circle.step6messagemicroservice.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import com.learnspring.circle.step6messagemicroservice.dao.MessageInfoRepository;
import com.learnspring.circle.step6messagemicroservice.entity.message_info;



@Service
public class messageinboxServiceImpl implements messageinboxService {
	
	MessageInfoRepository messageInfoRepository;
	
	@Autowired
	public messageinboxServiceImpl(MessageInfoRepository theMessageInfoRepository ){
		messageInfoRepository=theMessageInfoRepository;
	}
	
	
	

	@Override
	@Transactional
	public List<message_info> getmessagedata() {
		return messageInfoRepository.findAll();
	
	}

	

	@Override
	@Transactional
	public void savemessage(message_info themessage_info) {
		messageInfoRepository.save(themessage_info);
		
	}

	@Override
	@Transactional
	public message_info getmessageinfo(int theId) {
		
		Optional<message_info> result=messageInfoRepository.findById(theId);
		message_info themessageinfo=null;
		if(result.isPresent()){
			themessageinfo=result.get();
		}
		
		else {
			throw new RuntimeException("Not found the Message with id : "+theId);
		}
		
		
		
		
		return themessageinfo;
	}
	
	@Override
	@Transactional
	public void deleteById(int theId) {
	
		messageInfoRepository.deleteById(theId);

	}

}
