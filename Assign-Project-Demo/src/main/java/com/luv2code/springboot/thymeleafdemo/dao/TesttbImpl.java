package com.luv2code.springboot.thymeleafdemo.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.luv2code.springboot.thymeleafdemo.entity.circle;
import com.luv2code.springboot.thymeleafdemo.entity.user_info;

@Repository
public class TesttbImpl implements TesttbDAO {
	
	
	/*
	   private SessionFactory sessionFactory;

	 public TesttbImpl (SessionFactory thesessionFactory) {
		 sessionFactory=thesessionFactory;
		 System.out.println("Hello");
	 }
	 */
	 
	 
	 
	//define fields for Entitymanager
		private EntityManager entityManager;
		
		
		//set up constructor injeciton
		
		@Autowired
		public TesttbImpl(EntityManager theentityManager){
			entityManager=theentityManager;
		}
		
	
	
@Override
	
	public List<circle> getCircledata() {
	
		//get current hiberate session
				//Session currentSession=sessionFactory.getCurrentSession();
		Session currentSession=entityManager.unwrap(Session.class);
			
				currentSession.beginTransaction();
				//cretae a query nd sort by lastname
				Query<circle> theQuery=
						currentSession.createQuery("from circle",circle.class);
				
				
				
				//execute query and get result
				List<circle> results=theQuery.getResultList();
					
				//return the result
				//System.out.println("abc");
				
				currentSession.getTransaction().commit();
				
				currentSession.close();
				
		return results;
	}



@Override
public List<user_info> getUserdata() {
	Session currentSession=entityManager.unwrap(Session.class);
	
	currentSession.beginTransaction();
	//cretae a query nd sort by lastname
	Query<user_info> theQuery=
			currentSession.createQuery("from user_info",user_info.class);
	
	
	
	//execute query and get result
	List<user_info> results=theQuery.getResultList();
		
	//return the result
	//System.out.println("abc");
	
	currentSession.getTransaction().commit();
	
	currentSession.close();
	
return results;
}

}
