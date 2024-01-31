package com.tap.acad;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tap.entity.Employee;

public class AirportTester {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		SessionFactory bean = (SessionFactory)context.getBean("sessionfactory");
		Session session = bean.openSession();
	    Transaction transaction = session.beginTransaction();
	    
	    Employee e = new Employee(7, "mallikarjun", "trainer", 35000);
	    session.save(e);
	    
	    transaction.commit();
	}
}
