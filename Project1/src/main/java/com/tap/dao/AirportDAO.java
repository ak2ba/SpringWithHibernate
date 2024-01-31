package com.tap.dao;

import java.io.Serializable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.tap.entity.AirportEntity;

@Component
public class AirportDAO {
	SessionFactory factory;
	
	@Autowired
	public AirportDAO(SessionFactory factory) {
		super();
		this.factory = factory;
	}
	public void setFactory(SessionFactory factory) {
		this.factory = factory;
	}
	public void saveEntity()
	{
		Session session = this.factory.openSession();
		
		Transaction beginTransaction = session.beginTransaction();
		AirportEntity entity = new AirportEntity(2, "aaa", "bng", 2, 1);
		
		Serializable save = session.save(entity);
		System.out.println(save);
		beginTransaction.commit();
		
	}
}
