package com.learnspring.user.step6usermicroservice.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learnspring.user.step6usermicroservice.dao.UserRepository;
import com.learnspring.user.step6usermicroservice.entity.user_info;

@Service
public class UserServiceImpl implements UserService {
	
	private UserRepository userRepository;
	

@Autowired
	public UserServiceImpl (UserRepository theuserRepository){
		userRepository=theuserRepository;
	}
	
	

	@Override
	public List<user_info> findAll() {
		// TODO Auto-generated method stub
		return userRepository.findAll();
	}

	@Override
	public user_info findById(int theId) {
		// TODO Auto-generated method stub
		Optional<user_info> result=userRepository.findById(theId);
		user_info theuser_info=null;
		if(result.isPresent()){
			theuser_info=result.get();
		}
		
		else {
			throw new RuntimeException("Not found the User with id : "+theId);
		}
		return theuser_info ;
	}

	@Override
	public void save(user_info theuser) {
		
		userRepository.save(theuser);
	}

	@Override
	public void deleteById(int theId) {
		userRepository.deleteById(theId);

	}



	@Override
	public user_info findByUserid(String userName) {
		Optional<user_info> result=userRepository.findByUserid(userName);
		user_info theuser_info=null;
		if(result.isPresent()){
			theuser_info=result.get();
		}
		
		else {
			throw new RuntimeException("Not found the User with id : "+userName);
		}
		return theuser_info ;
		
	}

}
