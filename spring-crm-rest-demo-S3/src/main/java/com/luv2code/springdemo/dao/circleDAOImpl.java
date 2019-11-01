package com.luv2code.springdemo.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.luv2code.springdemo.entity.circle;
import com.luv2code.springdemo.entity.user_info;

@Repository
public class circleDAOImpl implements circleDAO {
	

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public List<circle> getCircledata() {
		
		Session currentSession = sessionFactory.getCurrentSession();
		
		
		//cretae a query nd sort by lastname
		Query<circle> theQuery=
				currentSession.createQuery("from circle",circle.class);
		
		
		
		//execute query and get result
		List<circle> results=theQuery.getResultList();

		
		
		

		
	return results;
	}

	@Override
	public circle getCircle(int theId) {
		// get the current hibernate session
					Session currentSession = sessionFactory.getCurrentSession();
					
					// now retrieve/read from database using the primary key
					circle thecircle= currentSession.get(circle.class, theId);
					
					return thecircle;
	}

	@Override
	public void deleteCircle(int theId) {
		Session currentSession = sessionFactory.getCurrentSession();
		Query theQuery = 
				currentSession.createQuery("delete from circle where id=:circleId");
		theQuery.setParameter("circleId", theId);
		
		theQuery.executeUpdate();	
		
	}

	@Override
	public void saveCircle(circle theCircle) {
		Session currentSession = sessionFactory.getCurrentSession();
		
		// save/upate the customer ... finally LOL
		currentSession.saveOrUpdate(theCircle);
		
	}

}
