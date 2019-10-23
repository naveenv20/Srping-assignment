package com.learnspring.assign.assin1.config;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import com.learnspring.assign.assin1.config.ApplicationContextConfig;
import com.learnspring.assign.assin1.config.HibernateUtil;

public class WebApplicationInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		
		return new Class[]{HibernateUtil.class} ;
		
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class[]{ApplicationContextConfig.class} ;
		
	}

	@Override
	protected String[] getServletMappings() {
		// TODO Auto-generated method stub
		return new String[] { "/" };
	}

}
