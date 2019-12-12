package com.learnspring.circle.step6messagemicroservice.entity;

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
	
	@Column(name="sender_id")
	private int senderId;
	
	public int getSenderId() {
		return senderId;
	}

	public void setSenderId(int senderId) {
		this.senderId = senderId;
	}


	
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





	

//	public message_info(String message, int receiver_id, boolean iscircle, Date doj) {
//		
//		this.message = message;
//		this.receiver_id = receiver_id;
//		this.iscircle = iscircle;
//		this.doj = doj;
//	}
//
//
//
//	public message_info(int id, String message, int receiver_id, boolean iscircle, Date doj, user_info user_Info) {
//		super();
//		this.id = id;
//		this.message = message;
//		this.receiver_id = receiver_id;
//		this.iscircle = iscircle;
//		this.doj = doj;
//		this.user_Info = user_Info;
//	}

	@Override
	public String toString() {
		return "message_info [id=" + id + ", message=" + message + ", receiver_id=" + receiver_id + ", iscircle="
				+ iscircle + ", doj=" + doj + "]";
	}
	
	
	
	
}
