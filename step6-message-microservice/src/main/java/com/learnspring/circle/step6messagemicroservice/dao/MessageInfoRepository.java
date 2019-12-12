package com.learnspring.circle.step6messagemicroservice.dao;



import org.springframework.data.jpa.repository.JpaRepository;

import com.learnspring.circle.step6messagemicroservice.entity.message_info;



public interface MessageInfoRepository extends JpaRepository<message_info, Integer>{

	

}
