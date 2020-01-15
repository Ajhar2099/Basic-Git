package com.bad.helper;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class SessionFactoryHelper {
	private static SessionFactory sessionFactory;
	
	static{
		
		try{
			Configuration configuration = new Configuration();
        	configuration.configure("hibernate.cfg.xml");
        	System.out.println("Hibernate Configuration loaded");
        	
        	//apply configuration property settings to StandardServiceRegistryBuilder
        	ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
        	System.out.println("Hibernate serviceRegistry created");
        	
        	 sessionFactory = configuration
        						.buildSessionFactory(serviceRegistry);
        	
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static SessionFactory getSessionFactory(){
		
		return sessionFactory;
	}
	
	public static void close() {
		if (sessionFactory != null) {
			sessionFactory.close();
		}
	}
}
