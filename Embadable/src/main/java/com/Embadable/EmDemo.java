package com.Embadable;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class EmDemo {

	public static void main(String[] args) {
		
		Student ss = new  Student();
		
		ss.setName("y");
		Certificate certi = new Certificate(); 
		certi.getCourse(); 
		certi.setCourse("python");
		certi.setDuration("5 monthss");
		ss.setCerti(certi);
		
		Student s1 = new  Student();
		
		s1.setName("z");
		Certificate certi1 = new Certificate();
		certi1.getCourse();
		certi1.setCourse("html/css");
		certi1.setDuration("82 monthsss");
		s1.setCerti(certi1);
		
		Student s2 = new  Student();
		
		s2.setName("e");
		Certificate certi2 = new Certificate();
		certi2.getCourse();
		certi2.setCourse("business development");
		certi2.setDuration("123 monthsss");
		s2.setCerti(certi2);
		
		 Session s = HibernateUtil.getSessionFactory().openSession();
		 Transaction tx =  s.beginTransaction();
		
		 
	 
		s.save(ss);
		s.save(s1);
		s.save(s2);
		
		
		
		
		tx.commit();

		
		s.close();
		HibernateUtil.getSessionFactory().close();
		
	}

}
