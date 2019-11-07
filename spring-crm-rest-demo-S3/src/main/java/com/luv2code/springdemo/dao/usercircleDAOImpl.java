package com.luv2code.springdemo.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.luv2code.springdemo.entity.circle;
import com.luv2code.springdemo.entity.user_circle;

@Repository
public class usercircleDAOImpl implements usercircleDAO {

	

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public List<user_circle> getusercircledata(int circleId) {
		
		Session currentSession = sessionFactory.getCurrentSession();
		
		// delete object with primary key
		Query theQuery = 
				currentSession.createQuery("from user_circle where circle_id=:circleId");
		theQuery.setParameter("circleId", circleId);
		
		//theQuery.executeUpdate();
		// for select multpile results optout
		
		List<user_circle> results=theQuery.list();
		
		return results;
	}

	@Override
	public List<user_circle> getusercircledata2(int userId) {
	Session currentSession = sessionFactory.getCurrentSession();
		
		// delete object with primary key
		Query theQuery = 
				currentSession.createQuery("from user_circle where user_id=:userId");
		theQuery.setParameter("userId", userId);
		
		//theQuery.executeUpdate();
		// for select multpile results optout
		
		List<user_circle> results=theQuery.list();
		
		return results;
	}

	@Override
	public void saveUserCircle(user_circle theUserCircle) {
Session currentSession = sessionFactory.getCurrentSession();
		
		// save/upate the customer ... finally LOL
		currentSession.saveOrUpdate(theUserCircle);
	}
	
	
	@Override
	public circle getCircle(int circleId) {
		// get the current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();
		
		// now retrieve/read from database using the primary key
		circle thecircle= currentSession.get(circle.class, circleId);
		
		return thecircle;
	}

	@Override
	public void deleteCircle(int usercircleId) {

		Session currentSession = sessionFactory.getCurrentSession();
		Query theQuery = 
				currentSession.createQuery("delete from user_circle where id=:usercircleId");
		theQuery.setParameter("usercircleId", usercircleId);
		
		theQuery.executeUpdate();
		
	}

}
