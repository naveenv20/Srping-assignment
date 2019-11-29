package com.learnspring.user.step6usermicroservice.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learnspring.user.step6usermicroservice.entity.user_info;



public interface UserRepository extends JpaRepository<user_info, Integer> {
	
	// this JpaRepository is going to give all the Crud functions
		//findall
	// find by id
		//save
		//delete
		//spring data jpa --using this 

}
