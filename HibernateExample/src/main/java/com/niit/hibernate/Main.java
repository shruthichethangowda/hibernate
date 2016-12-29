package com.niit.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main 
{
    public static void main( String[] args )
    {
    	Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml"); 
 
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Catagories p=new Catagories();
 
		p.setCatagoryId(101);
		p.setCatagoryName("Phone");
		
 
		Transaction tx = session.beginTransaction();
		session.save(p);
		System.out.println("Object saved successfully.....!!");
		tx.commit();
		session.close();
		factory.close();
    }
}
