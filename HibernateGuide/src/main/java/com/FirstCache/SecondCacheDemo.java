package com.FirstCache;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import org.hibernate.cfg.Configuration;

import com.test.HibernateGuide.Student;

public class SecondCacheDemo {
	public static void main(String args[]) {
		
		
		SessionFactory factory = new Configuration().configure("hconfig.xml").buildSessionFactory();

		Session s = factory.openSession();
		Student student = s.get(Student.class,1);
		System.out.println(student);
		
		
		
		
		s.close();
		
		Session s1 = factory.openSession();
		Student student1 = s1.get(Student.class,1);
		System.out.println(student1);
		s1.close();

	}

}
