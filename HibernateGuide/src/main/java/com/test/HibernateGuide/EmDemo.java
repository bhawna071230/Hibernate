package com.test.HibernateGuide;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmDemo {

	public static void main(String[] args) {
		SessionFactory sf = new Configuration().configure("hconfig.xml").addAnnotatedClass(Student.class)
				.buildSessionFactory();
		Student s = new  Student();
		s.setId(1);
		s.setName("adhya");
		Certificate certi = new Certificate(); 
		certi.getCourse(); 
		certi.setCourse("python ");
		certi.setDuration("2 monthss");
		s.setCerti(certi);
		
		Student s1 = new  Student();
		s1.setId(2);
		s1.setName("arpit");
		Certificate certi1 = new Certificate();
		certi1.getCourse();
		certi1.setCourse("html/css");
		certi1.setDuration("8 monthsss");
		s1.setCerti(certi1);
		
		Student s2 = new  Student();
		s2.setId(3);
		s2.setName("yogesh");
		Certificate certi2 = new Certificate();
		certi2.getCourse();
		certi2.setCourse("business development");
		certi2.setDuration("12 monthsss");
		s2.setCerti(certi2);
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
	 
		session.save(s);
		session.save(s1);
		session.save(s2);
		
		
		
		
		tx.commit();
		
		session.close();
		sf.close();
		
	}

}
