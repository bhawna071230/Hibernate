package com.SqlQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration; 

public class FetchData {

	public static void main(String[] args) {
		SessionFactory sf = new Configuration().configure("/com/SqlQuery/hconfig.xml").addAnnotatedClass(StudentSql.class)
				.buildSessionFactory();
		Session session = sf.openSession();
		StudentSql student = (StudentSql) session.load(StudentSql.class, 1);
		System.out.println(student);
		


		session.close();
		

	}
}
