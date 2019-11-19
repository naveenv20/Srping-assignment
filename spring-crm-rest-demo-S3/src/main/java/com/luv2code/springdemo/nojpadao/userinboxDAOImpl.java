package com.luv2code.springdemo.nojpadao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.luv2code.springdemo.entity.user_circle;
import com.luv2code.springdemo.entity.user_inbox;

@Repository
public class userinboxDAOImpl implements userinboxDAO {

	
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public List<user_inbox> getinboxdata(int receiverId) {
		
		
		
		Session currentSession = sessionFactory.getCurrentSession();

		// delete object with primary key
		Query theQuery = currentSession.createQuery("from user_inbox where receiver_id=:receiverId");
		theQuery.setParameter("receiverId", receiverId);

		// theQuery.executeUpdate();
		// for select multpile results optout

		List<user_inbox> results = theQuery.list();

		return results;
		
		
	}

}
