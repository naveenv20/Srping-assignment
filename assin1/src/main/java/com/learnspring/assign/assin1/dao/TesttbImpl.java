package com.learnspring.assign.assin1.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.learnspring.assign.assin1.entity.testtb;

@Repository
public class TesttbImpl implements TesttbDAO {
	
	
	 @Autowired
	   private SessionFactory sessionFactory;

	@Override
	@Transactional
	public List<testtb> getTestdata() {
	
		//get current hiberate session
				Session currentSession=sessionFactory.getCurrentSession();
				
				//cretae a query nd sort by lastname
				Query<testtb> theQuery=
						currentSession.createQuery("from testtb order by lastname",testtb.class);
				
				//execute query and get result
				List<testtb> results=theQuery.getResultList();
					
				//return the result
				//System.out.println("abc");
				
				
		return results;
	}

}
