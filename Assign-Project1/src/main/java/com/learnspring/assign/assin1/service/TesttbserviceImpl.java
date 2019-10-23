package com.learnspring.assign.assin1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.learnspring.assign.assin1.dao.TesttbDAO;
import com.learnspring.assign.assin1.entity.testtb;

@Service
public class TesttbserviceImpl implements Testtbservice {

	
	private TesttbDAO testtbDAO;
	
	public TesttbserviceImpl (TesttbDAO thetesttbDAO) {
		testtbDAO=thetesttbDAO;
	}
	
	@Override
	
	public List<testtb> getTestdata() {
		// TODO Auto-generated method stub
		return testtbDAO.getTestdata();
	}

}
