package com.ncs.HibernateManager;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.ncs.Entity.Users;

public class HibernateManager {
	
	SessionFactory factory;
	Session session;
	
	public HibernateManager(){
		factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Users.class)
				.buildSessionFactory();
		session = factory.getCurrentSession();
		System.out.println("HibernateManager constructor");
	}
	
	public int register(String name, String pwd) {
		try{
			Users u = new Users(name,pwd);
			Transaction t = session.beginTransaction();
			session.save(u);
			t.commit();
			return 1;
		}
		catch(Exception e) {
			e.printStackTrace();
			return 0;
		}
	}

	public int login(String name, String pwd) {
		Users u = new Users(name,pwd);
		try {
			Transaction t = session.beginTransaction();
			Users u1 = (Users) session.get(Users.class, name);
			t.commit();
			System.out.println(u1);
			return 1;
		}
		catch(Exception e) {
			e.printStackTrace();
			return 0;
		}
	}
}






