package com.Embadable;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;


public class CriteriaApi {
	public static void main(String[] args) {
		Session s = HibernateUtil.getSessionFactory().openSession();
		 Transaction tx =  s.beginTransaction();
		

		Criteria c = s.createCriteria(Student.class);
		//c.add(Restrictions.eq("certi.course", "python")); 
		//c.add(Restrictions.gt("id", 6));
		c.add(Restrictions.ilike("certi.course", "ML%"));
		
		List<Student> student = c.list();
		for (Student st : student) { 
			System.out.println(st);
		}
        tx.commit();
		s.close();
		HibernateUtil.getSessionFactory().close();

	}
}
