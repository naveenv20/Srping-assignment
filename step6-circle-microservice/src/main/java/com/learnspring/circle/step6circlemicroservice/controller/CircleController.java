package com.learnspring.circle.step6circlemicroservice.controller;

import java.util.ArrayList;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learnspring.circle.step6circlemicroservice.entity.circle;
import com.learnspring.circle.step6circlemicroservice.entity.circlebean;
import com.learnspring.circle.step6circlemicroservice.entity.user_info;
import com.learnspring.circle.step6circlemicroservice.service.CircleService;







@RestController
@RequestMapping("/api")
public class CircleController {
	
	
	private CircleService circleService;
	
	@Autowired
	private  UserServiceProxy userServiceProxy;
	 
	 @Autowired
	 public CircleController(CircleService theCircleService){
		 circleService=theCircleService;
	 }
	 
	 
	@RequestMapping("/circles")
	public List<circle> getcircles(Model theModel){
			
		
		// get users from the service
				List<circle> thecircles = circleService.findAll();
				
				
				
				
				
				
				
//				 return userRating.getRatings().stream()
//			                .map(rating -> {
//			                    Movie movie = restTemplate.getForObject("http://movie-info-service/movies/" + rating.getMovieId(), Movie.class);
//			                    return new CatalogItem(movie.getName(), movie.getDescription(), rating.getRating());
//			                })
//			                .collect(Collectors.toList());
				
				
				
				
				// add the customers to the model
				theModel.addAttribute("circlelist", thecircles);
				
				//return "list-users";
		
		
		return thecircles;
		
	}
	
	@RequestMapping("/circlebeans")
	public List<circlebean> getcirclebeanss(Model theModel){
			
		
		// get users from the service
				List<circle> thecircles = circleService.findAll();
				
				List<circlebean> thecirclesbeans= new ArrayList<>();
				
				for (circle c:thecircles) {
					
				user_info uf=	userServiceProxy.retrieveUser(c.getCreatedby());
					
					
					circlebean cb= new circlebean(c,uf);
					thecirclesbeans.add(cb);
				}
				
				
				
//				 return userRating.getRatings().stream()
//			                .map(rating -> {
//			                    Movie movie = restTemplate.getForObject("http://movie-info-service/movies/" + rating.getMovieId(), Movie.class);
//			                    return new CatalogItem(movie.getName(), movie.getDescription(), rating.getRating());
//			                })
//			                .collect(Collectors.toList());
				
				
				
				
				// add the customers to the model
				theModel.addAttribute("circlelist", thecirclesbeans);
				
				//return "list-users";
		
		
		return thecirclesbeans;
		
	}
	
	
	//add mapping get customer --with customer id7n 
	@RequestMapping("/circlebeans/{circleId}")
	public circlebean getcirclebean(@PathVariable int circleId ){
		
		
			
		circle thecircle=circleService.findById(circleId);
		user_info uf=	userServiceProxy.retrieveUser(thecircle.getCreatedby());
		circlebean thecirclebean= new circlebean(thecircle, uf);
	
		
		return thecirclebean;
		
	}
	
	
	//add mapping get customer --with customer id7n 
		@RequestMapping("/circles/{circleId}")
		public circle getcircle(@PathVariable int circleId ){
			
			
				
			circle thecircle=circleService.findById(circleId);
			
		
			
			return thecircle;
			
		}
	
	
		
		
		
		@GetMapping("/circles/u/{circleName}")
		
		public circle getcircle(@PathVariable String circleName ){
			
			
				
			circle thecircle=circleService.findByName(circleName);
			
		
			
			return thecircle;
		}
		
		
	//add mapping for POST /customers     adding a new customer
	
	@PostMapping("/circles")
	public circle addCircle(@RequestBody circle theCircle){
		
		//also just in the case the pass the id in JSON ...set id to 0
		//this is force a save of new item .. instead of doing update 
		circleService.save(theCircle);
			return theCircle;
		
	}
	
	
	// add mapping for PUT /customers for updating the customers
	
	@PutMapping("/circles")
	public circle updateCircle(@RequestBody circle theCircle){
		
		
		//also just in the case the pass the id in JSON ...set id to the value u want delete
		//
		circleService.save(theCircle);
		
		
		return theCircle;
		
	}
	
	
	// add mapping for DELETE /customers for deleting the customer
	
	@DeleteMapping("/circles/{circleId}")
	public String deletecircle(@PathVariable int circleId) {

		circle theCircle = circleService.findById(circleId);
		
		
		circleService.deleteById(circleId);
		return "Delete Customer id :  "+circleId;
		
	}
	

}
