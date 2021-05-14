package com.map.xml;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory factory = new Configuration().configure("hconfig.xml").buildSessionFactory();
		
		
		Person p = new Person();
		p.setId(1);
		p.setName("bhawna");
		p.setAddress("mohali,india");
		p.setPhone("8146636024");
		

		Session s = factory.openSession();
		Transaction tx = s.beginTransaction();
		s.save(p);
		
		
		
		
		tx.commit();
		s.close();
		factory.close();


	}

}
