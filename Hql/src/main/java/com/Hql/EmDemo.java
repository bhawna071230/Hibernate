package com.Hql;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmDemo {

	public static void main(String[] args) {
		 
		Stuhql ss = new  Stuhql();
		ss.setId(1);
		ss.setName("bhawnaa");
		Certificate certi = new Certificate(); 
		certi.getCourse(); 
		certi.setCourse("ML1");
		certi.setDuration("2 monthss"); 
		ss.setCerti(certi);
		
		Stuhql s1 = new  Stuhql();
		s1.setId(2);
		s1.setName("amanm");
		Certificate certi1 = new Certificate();
		certi1.getCourse();
		certi1.setCourse("html/css");
		certi1.setDuration("8 monthsss");
		s1.setCerti(certi1);
		
		Stuhql s2 = new  Stuhql();
		s2.setId(3);
		s2.setName("molulu");
		Certificate certi2 = new Certificate();
		certi2.getCourse();
		certi2.setCourse("business development");
		certi2.setDuration("12 monthsss");
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
