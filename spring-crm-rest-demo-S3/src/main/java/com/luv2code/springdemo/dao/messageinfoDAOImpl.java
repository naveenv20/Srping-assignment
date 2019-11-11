package com.luv2code.springdemo.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.luv2code.springdemo.entity.circle;
import com.luv2code.springdemo.entity.message_info;
import com.luv2code.springdemo.entity.user_info;


@Repository
public class messageinfoDAOImpl implements messageinfoDAO{
	

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public List<message_info> getmessagedata() {
		Session currentSession = sessionFactory.getCurrentSession();

		// delete object with primary key
		Query<message_info> theQuery=
				currentSession.createQuery("from message_info",message_info.class);
		
		
		
		//execute query and get result
		List<message_info> messages=theQuery.getResultList();

		

	

		return messages;
		
		
	}

	@Override
	public List<user_info> getsenders() {
		
		Session currentSession = sessionFactory.getCurrentSession();

		// delete object with primary key
		Query<user_info> theQuery=
				currentSession.createQuery("from user_info",user_info.class);
		
		
		
		//execute query and get result
		List<user_info> senders=theQuery.getResultList();

		

	

		return senders;
		
		
		
		
	}

	@Override
	public List<user_info> getreceivers() {
		Session currentSession = sessionFactory.getCurrentSession();

		// delete object with primary key
		Query<user_info> theQuery=
				currentSession.createQuery("from user_info",user_info.class);
		
		
		
		//execute query and get result
		List<user_info> receivers=theQuery.getResultList();

		

	

		return receivers;
	}

	@Override
	public List<circle> getcircles() {
		Session currentSession = sessionFactory.getCurrentSession();

		// delete object with primary key
		Query<circle> theQuery=
				currentSession.createQuery("from circle",circle.class);
		
		
		
		//execute query and get result
		List<circle> circles=theQuery.getResultList();

		

	

		return circles;
	}

	@Override
	public void savemessage(message_info themessage_info) {
Session currentSession = sessionFactory.getCurrentSession();
		
		// save/upate the customer ... finally LOL
		currentSession.saveOrUpdate(themessage_info);
		
	}

	@Override
	public message_info getmessageinfo(int theId) {
		Session currentSession = sessionFactory.getCurrentSession();
		
		// now retrieve/read from database using the primary key
		message_info themessage_info= currentSession.get(message_info.class, theId);
		
		return themessage_info;
		
	}

}
