package com.Embadable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FetchDemo { 

	public static void main(String[] args) {
		SessionFactory sf = new Configuration().configure("hconfig.xml").addAnnotatedClass(Student.class)
				.buildSessionFactory();
		Session session = sf.openSession();
		Address ad = (Address) session.get(Address.class, 1);
		System.out.println(ad.getStreet() +":"+ad.getCity());
		
		
	
		
		
		session.close();
		sf.close();

	}

}
