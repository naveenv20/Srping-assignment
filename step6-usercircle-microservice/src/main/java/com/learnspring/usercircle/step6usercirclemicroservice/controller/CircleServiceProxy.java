package com.learnspring.usercircle.step6usercirclemicroservice.controller;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.learnspring.usercircle.step6usercirclemicroservice.entity.circle;
import com.learnspring.usercircle.step6usercirclemicroservice.entity.user_info;

@FeignClient(name="circle-service")
@RibbonClient(name="circle-service")
public interface CircleServiceProxy {
	
	@GetMapping("/api/circles/{circleId}")
	public circle retrieveCircle
	(@PathVariable("circleId") int circleId) ;






}

	
	

