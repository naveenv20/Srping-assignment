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

import com.learnspring.assign.assin1.entity.testtb;


@Configuration
@ComponentScan(basePackages = {"com.learnspring.assign.assin1"})
public class HibernateUtil {

	@Autowired
    private ApplicationContext context;
	
	// read spring config java class
//			AnnotationConfigApplicationContext context = 
//					new AnnotationConfigApplicationContext(ApplicationContextConfig.class);
// 
    @Bean
    public LocalSessionFactoryBean getSessionFactory() {
        LocalSessionFactoryBean factoryBean = new LocalSessionFactoryBean();
        factoryBean.setConfigLocation(context.getResource("classpath:hibernate.cfg.xml"));
        factoryBean.setAnnotatedClasses(testtb.class);
        System.out.println("======================>>>>>>>>: "+context.getApplicationName());
        System.out.println("======================>>>>>>>>: "+context.getDisplayName());
        System.out.println("======================>>>>>>>>: "+context.toString());
        return factoryBean;
    }
 
    @Bean
    @Autowired
    public HibernateTransactionManager getTransactionManager() {
        HibernateTransactionManager transactionManager = new HibernateTransactionManager();
        transactionManager.setSessionFactory(getSessionFactory().getObject());
        return transactionManager;
    }
    
    
    
    
 
    
    
    
    
	
}
