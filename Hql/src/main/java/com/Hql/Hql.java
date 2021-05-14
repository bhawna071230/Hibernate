package com.Hql;

import java.util.Arrays;
import java.util.List;

import org.hibernate.query.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Hql {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("/com/Hql/hconfig.xml");
		SessionFactory factory = cfg.buildSessionFactory();

		Session s = factory.openSession();

		// HQL
		// Syntax:
		//

		String query = "from Stuhql as s  where s.id=:x and s.name= :n";

		Query q = s.createQuery(query);

		q.setParameter("x", 1);
		q.setParameter("n", "Peter");
		// single - (Unique)
		// multiple-list
		List<Stuhql> list = q.list();

		for (Stuhql student : list) {
			System.out.println(student.getName() + " : " + student.getId());
		}

		System.out.println("___________________________________________");

		Transaction tx = s.beginTransaction();
//		delete query
//		Query q2 = s.createQuery("delete from Student  s where s.city=:c");
//		q2.setParameter("c", "ABC");
//		int r = q2.executeUpdate();
//		System.out.println("Deleted:");
//		System.out.println(r);
//		update query
		Query q2 = s.createQuery("update Stuhql set id=:c where name=:n");
		
		q2.setParameter("c", 2);
		q2.setParameter("n", "john");
		int r = q2.executeUpdate();
		System.out.println(r + "objects updated");

		tx.commit();

//how to execute join query
		Query q3 = s
				.createQuery("select q.question ,q.qid,a.answer from QuestionHql as q INNER JOIN  q.answer as a ");

		List<Object[]> list3 = q3.getResultList();

		for (Object[] arr : list3) {
			System.out.println(Arrays.toString(arr));
		}

		s.close();
		factory.close();
	}
}
