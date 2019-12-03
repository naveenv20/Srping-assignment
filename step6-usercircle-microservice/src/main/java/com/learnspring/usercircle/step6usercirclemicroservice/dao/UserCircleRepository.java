package com.learnspring.usercircle.step6usercirclemicroservice.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learnspring.usercircle.step6usercirclemicroservice.entity.user_circle;



public interface UserCircleRepository extends JpaRepository<user_circle, Integer>{

}
