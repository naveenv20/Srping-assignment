package com.learnspring.circle.step6circlemicroservice.controller;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.learnspring.circle.step6circlemicroservice.entity.user_info;



@FeignClient(name="user-service")
@RibbonClient(name="user-service")
public interface UserServiceProxy {
	
@GetMapping("/api/users/{userId}")
	
	public user_info retrieveUser
	(@PathVariable("userId") String userId) ;


}
