package com.luv2code.springdemo.entity;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonBackReference;


@Entity
@Table(name="user_inbox")
public class user_inbox {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="message")
	private String message;
	
	@Column(name="receiver_id")	
	private int receiver_id;
	
	@Column(name="iscircle")	
	private boolean iscircle;
	
	@Column(name="received_date_time")	
	@Temporal(value= TemporalType.TIMESTAMP)
	private Date doj;
	
	@ManyToOne(cascade={CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST,
			CascadeType.REFRESH})
	@JoinColumn(name="sender_id",insertable=false, updatable=false)
	private user_info sender_Info;
	
	
	@ManyToOne(cascade={CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST,
			CascadeType.REFRESH})
	@JoinColumn(name="receiver_id",insertable=false, updatable=false)
	private user_info receiver_Info;
	
	
	public user_inbox(){
		
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getMessage() {
		return message;
	}


	public void setMessage(String message) {
		this.message = message;
	}


	public int getReceiver_id() {
		return receiver_id;
	}


	public void setReceiver_id(int receiver_id) {
		this.receiver_id = receiver_id;
	}


	public boolean isIscircle() {
		return iscircle;
	}


	public void setIscircle(boolean iscircle) {
		this.iscircle = iscircle;
	}


	public Date getDoj() {
		return doj;
	}


	public void setDoj(Date doj) {
		this.doj = doj;
	}

	@JsonBackReference
	public user_info getSender_Info() {
		return sender_Info;
	}


	public void setSender_Info(user_info sender_Info) {
		this.sender_Info = sender_Info;
	}

	@JsonBackReference
	public user_info getReceiver_Info() {
		return receiver_Info;
	}


	public void setReceiver_Info(user_info receiver_Info) {
		this.receiver_Info = receiver_Info;
	}
	
	

}
