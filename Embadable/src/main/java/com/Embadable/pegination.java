package com.Embadable;

import java.util.List;

import org.hibernate.query.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class pegination {
	public static void main(String[] args) {
		 Session s = HibernateUtil.getSessionFactory().openSession();
		 Transaction tx =  s.beginTransaction();
		Query query = s.createQuery("from Student");

		// implementing pegination using hibernate

		query.setFirstResult(3);

		query.setMaxResults(6);

		List<Student> list = query.list();

		for (Student st : list) {
			System.out.println(st.getId()+" : "+st.getName() + " : " + st.getCerti().getDuration());
		}
		tx.commit();

		s.close();
		HibernateUtil.getSessionFactory().close();

	}

}
