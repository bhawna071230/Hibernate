package com.Criteria.api;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

import com.test.HibernateGuide.Student;

public class CriteriaApi {
	public static void main(String[] args) {

		Session s = new Configuration().configure("hconfig.xml").buildSessionFactory().openSession();

		Criteria c=  s.createCriteria(Student.class);
		c.add(Restrictions.eq("name", "bhawna"));
		List<Student> student =  c.list();
		for(Student st:student) {
			System.out.println(st.getName());
		}
		
		s.close();

	}
}
