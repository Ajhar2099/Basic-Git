package com.bad.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.bad.entity.Student;
import com.bad.helper.SessionFactoryHelper;

public class HibernateTest {

	public static void main(String[] args) {
		SessionFactory sessionFactory=null;
		Session session=null;
		Transaction tx=null;
		boolean flag = false;
		Student stud=null;
		
		try{
			sessionFactory = SessionFactoryHelper.getSessionFactory();
			session = sessionFactory.openSession();
			tx = session.beginTransaction();
			stud = new Student(102, "Vasim", 25,"Abad");
			session.save(stud);
			
			
			
			flag = true;
		}finally {
			
			if(flag){
				tx.commit();
			}else{
				tx.rollback();
			}
			session.close();
		}
		SessionFactoryHelper.close();
	}
	public void method1(){
		System.out.println("checking  in git");
	}
}
