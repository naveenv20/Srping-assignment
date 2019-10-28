package com.luv2code.springdemo.dao;

import java.util.List;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.luv2code.springdemo.entity.circle;
import com.luv2code.springdemo.entity.message_info;
import com.luv2code.springdemo.entity.user_inbox;
import com.luv2code.springdemo.entity.user_info;


@Repository
public class TesttbImpl implements TesttbDAO {


	@Autowired
	private SessionFactory sessionFactory;
	
	
	
@Override
	
	public List<circle> getCircledata() {
	
		//get current hiberate session
				//Session currentSession=sessionFactory.getCurrentSession();
		Session currentSession = sessionFactory.getCurrentSession();
			
				
				//cretae a query nd sort by lastname
				Query<circle> theQuery=
						currentSession.createQuery("from circle",circle.class);
				
				
				
				//execute query and get result
				List<circle> results=theQuery.getResultList();
					
				
				
				
		return results;
	}



@Override
public List<user_info> getUserdata() {
	Session currentSession = sessionFactory.getCurrentSession();
	
	
	//cretae a query nd sort by lastname
	Query<user_info> theQuery=
			currentSession.createQuery("from user_info",user_info.class);
	
	
	
	//execute query and get result
	List<user_info> results=theQuery.getResultList();

	
	
	

	
return results;
}



@Override
public List<message_info> getMessagedata() {
	Session currentSession = sessionFactory.getCurrentSession();
	
	
	//cretae a query nd sort by lastname
	Query<message_info> theQuery=
			currentSession.createQuery("from message_info",message_info.class);
	
	
	
	//execute query and get result
	List<message_info> results=theQuery.getResultList();
		
	
	
return results;
}



@Override
public List<user_inbox> getinboxdata() {
	

	Session currentSession = sessionFactory.getCurrentSession();
	
	
	Query<user_inbox> theQuery=
			currentSession.createQuery("from user_inbox",user_inbox.class);
	
	
	
	//execute query and get result
	List<user_inbox> results=theQuery.getResultList();
		
	
	
return results;
}



@Override
public user_info getuser(int theId) {
	
	// get the current hibernate session
			Session currentSession = sessionFactory.getCurrentSession();
			
			// now retrieve/read from database using the primary key
			user_info theuser= currentSession.get(user_info.class, theId);
			
			return theuser;
}



@Override
public void deleteUser(int theId) {
	// get the current hibernate session
			Session currentSession = sessionFactory.getCurrentSession();
			
			// delete object with primary key
			Query theQuery = 
					currentSession.createQuery("delete from user_info where id=:userId");
			theQuery.setParameter("userId", theId);
			
			theQuery.executeUpdate();	
	
}



@Override
public void saveUser(user_info theUser) {
	// get current hibernate session
			Session currentSession = sessionFactory.getCurrentSession();
			
			// save/upate the customer ... finally LOL
			currentSession.saveOrUpdate(theUser);
	
}

}
