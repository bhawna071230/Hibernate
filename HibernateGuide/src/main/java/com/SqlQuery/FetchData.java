package com.SqlQuery;

import org.hibernate.Session;
import org.hibernate.Transaction; 

public class FetchData {

	public static void main(String[] args) {
		Session s = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = s.beginTransaction();
		StudentSql student = (StudentSql) s.load(StudentSql.class, 1);
		System.out.println(student);
		tx.commit();

		s.close();
		HibernateUtil.getSessionFactory().close();

	}
}
