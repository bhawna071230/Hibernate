package com.CriteriaApi;

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
		

		Criteria c = s.createCriteria(StudentCriteriaApi.class);
		c.add(Restrictions.eq("name", "bhawna"));
		List<StudentCriteriaApi> student = c.list();
		for (StudentCriteriaApi st : student) { 
			System.out.println(st.getName());
		}
        tx.commit();
		s.close();
		HibernateUtil.getSessionFactory().close();

	}
}
