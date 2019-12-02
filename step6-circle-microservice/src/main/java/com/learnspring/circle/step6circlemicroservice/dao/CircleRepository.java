package com.learnspring.circle.step6circlemicroservice.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learnspring.circle.step6circlemicroservice.entity.circle;



public interface CircleRepository  extends JpaRepository<circle, Integer>{

}
