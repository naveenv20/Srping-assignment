package com.learnspring.assign.assin1.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

public class message_info {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	
	private String message;
	
	
	private String sender_id;
	
	
	private String receiver_id;
	
	private boolean iscircle;
	
	@Temporal(value= TemporalType.TIMESTAMP)
	private Date doj;
	
	
	
	

}
