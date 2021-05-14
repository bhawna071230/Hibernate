package com.pagination;

import java.util.List;

import org.hibernate.query.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.test.HibernateGuide.Student;

public class pegination {
	public static void main(String[] args) {

		SessionFactory factory = new Configuration().configure("hconfig.xml").buildSessionFactory();
		Session s = factory.openSession();
		Query query = s.createQuery("from Student");

		// implementing pegination using hibernate

		query.setFirstResult(10);

		query.setMaxResults(15);

		List<Student> list = query.list();

		for (Student st : list) {
			System.out.println(st.getId()+" : "+st.getName() + " : " + st.getCerti().getDuration());
		}

		s.close();
		factory.close();

	}

}
