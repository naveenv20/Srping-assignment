package com.learnspring.assign.assin1.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.learnspring.assign.assin1.entity.testtb;

@Repository
public class TesttbImpl implements TesttbDAO {
	
	
	
	   private SessionFactory sessionFactory;

	 public TesttbImpl (SessionFactory thesessionFactory) {
		 sessionFactory=thesessionFactory;
		 System.out.println("Hello");
	 }
	 
	 
	 
	@Override
	
	public List<testtb> getTestdata() {
	
		//get current hiberate session
				Session currentSession=sessionFactory.getCurrentSession();
			
				currentSession.beginTransaction();
				//cretae a query nd sort by lastname
				Query<testtb> theQuery=
						currentSession.createQuery("from testtb",testtb.class);
				
				//execute query and get result
				List<testtb> results=theQuery.getResultList();
					
				//return the result
				//System.out.println("abc");
				
				currentSession.getTransaction().commit();
				
				currentSession.close();
				
		return results;
	}

}
