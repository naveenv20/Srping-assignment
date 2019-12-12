package com.learnspring.circle.step6circlemicroservice.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learnspring.circle.step6circlemicroservice.dao.CircleRepository;
import com.learnspring.circle.step6circlemicroservice.entity.circle;

@Service
public class CircleServiceImpl implements CircleService {

private CircleRepository circleRepository;
	

@Autowired	
	public CircleServiceImpl (CircleRepository theCircleRepository){
		circleRepository=theCircleRepository;
	}
	
	@Override
	public List<circle> findAll() {
		// TODO Auto-generated method stub
		return circleRepository.findAll();
	}

	@Override
	public circle findById(int theId) {
		// TODO Auto-generated method stub
		
		Optional<circle> result=circleRepository.findById(theId);
		circle thecircle=null;
		if(result.isPresent()){
			thecircle=result.get();
		}
		
		else {
			throw new RuntimeException("Not found the User with id : "+theId);
		}
		
		
		return thecircle;
	}

	@Override
	public void save(circle theuser) {
		
		circleRepository.save(theuser);

	}

	@Override
	public void deleteById(int theId) {
	
		circleRepository.deleteById(theId);

	}

	@Override
	public circle findByName(String circle_Name) {
		Optional<circle> result=circleRepository.findByCirclename(circle_Name);
		circle thecircle=null;
		if(result.isPresent()){
			thecircle=result.get();
		}
		
		else {
			throw new RuntimeException("Not found the User with id : "+circle_Name);
		}
		
		
		return thecircle;
		
	}

}
