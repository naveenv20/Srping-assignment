package com.learnspring.assign.assin1.config;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.learnspring.assign.assin1.entity.circle;
import com.learnspring.assign.assin1.entity.message_info;
import com.learnspring.assign.assin1.entity.testtb;
import com.learnspring.assign.assin1.entity.user_circle;
import com.learnspring.assign.assin1.entity.user_info;


@Configuration
public class HibernateUtil {

	@Autowired
    private ApplicationContext context;
	

    @Bean
    public LocalSessionFactoryBean getSessionFactory() {
        LocalSessionFactoryBean factoryBean = new LocalSessionFactoryBean();
        factoryBean.setConfigLocation(context.getResource("classpath:hibernate.cfg.xml"));
        factoryBean.setAnnotatedClasses(user_info.class,circle.class,message_info.class,user_circle.class);
       
        
   
        return factoryBean;
    }
 
    @Bean
    public HibernateTransactionManager getTransactionManager() {
        HibernateTransactionManager transactionManager = new HibernateTransactionManager();
        transactionManager.setSessionFactory(getSessionFactory().getObject());
        return transactionManager;
    }
    
    
    
    
 
    
    
    
    
	
}
