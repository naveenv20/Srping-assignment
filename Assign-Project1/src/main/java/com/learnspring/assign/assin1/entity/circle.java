package com.learnspring.assign.assin1.entity;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="circle")
public class circle {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="created_date_time")	
	@Temporal(value= TemporalType.TIMESTAMP)
	private Date doj;
	
	
	


	@Column(name="circle_name")
	private String circle_name;
	

	
	@OneToOne(cascade={CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST,
			CascadeType.REFRESH})
	@JoinColumn(name="createdby")
	private user_info circle_user_Info;
	
	
	public circle(Date doj, String circle_name, user_info circle_user_Info) {
		super();
		this.doj = doj;
		this.circle_name = circle_name;
		this.circle_user_Info = circle_user_Info;
	}

	public circle() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getDoj() {
		return doj;
	}

	public void setDoj(Date doj) {
		this.doj = doj;
	}

	public String getCircle_name() {
		return circle_name;
	}

	public void setCircle_name(String circle_name) {
		this.circle_name = circle_name;
	}

	public user_info getCircle_user_Info() {
		return circle_user_Info;
	}

	public void setCircle_user_Info(user_info circle_user_Info) {
		this.circle_user_Info = circle_user_Info;
	}

	@Override
	public String toString() {
		return "circle [id=" + id + ", doj=" + doj + ", circle_name=" + circle_name + ", circle_user_Info="
				+ circle_user_Info + "]";
	}
	
	
	
	
}
