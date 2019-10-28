package com.luv2code.springdemo.entity;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
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
@Table(name="message_info")
public class message_info {
	
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
	
	
	@ManyToOne(fetch = FetchType.EAGER,cascade={CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST,
			CascadeType.REFRESH})
	@JoinColumn(name="sender_id")
	private user_info user_Info;
	

	
	public message_info() {
		
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
	public user_info getUser_Info() {
		return user_Info;
	}



	public void setUser_Info(user_info user_Info) {
		this.user_Info = user_Info;
	}



	public message_info(String message, int receiver_id, boolean iscircle, Date doj) {
		
		this.message = message;
		this.receiver_id = receiver_id;
		this.iscircle = iscircle;
		this.doj = doj;
	}



	@Override
	public String toString() {
		return "message_info [id=" + id + ", message=" + message + ", receiver_id=" + receiver_id + ", iscircle="
				+ iscircle + ", doj=" + doj + "]";
	}
	
	
	
	
}
