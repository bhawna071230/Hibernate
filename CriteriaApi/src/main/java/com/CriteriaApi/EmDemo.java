package com.CriteriaApi;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.Cascade.HibernateUtil;

public class EmDemo {

	public static void main(String[] args) {
		
		StudentCriteriaApi ss = new  StudentCriteriaApi();
		
		ss.setName("y");
		CertificateCriteriaApi certi = new CertificateCriteriaApi(); 
		certi.getCourse(); 
		certi.setCourse("python");
		certi.setDuration("5 monthss");
		ss.setCerti(certi);
		
		StudentCriteriaApi s1 = new  StudentCriteriaApi();
		
		s1.setName("z");
		CertificateCriteriaApi certi1 = new CertificateCriteriaApi();
		certi1.getCourse();
		certi1.setCourse("html/css");
		certi1.setDuration("82 monthsss");
		s1.setCerti(certi1);
		
		StudentCriteriaApi s2 = new  StudentCriteriaApi();
		
		s2.setName("e");
		CertificateCriteriaApi certi2 = new CertificateCriteriaApi();
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
