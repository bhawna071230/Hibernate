package com.hql;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.test.HibernateGuide.Student;

public class Hql {
	public static void main(String args[]) {
		Configuration cfg = new Configuration();
		cfg.configure("hconfig.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession(); 
		Transaction tx = s.beginTransaction();
		
		//HQL SYNTAX
	
		String query = "from Student as s where s.id=:x or s.name=:n";
		Query q= s.createQuery(query);
		q.setParameter("x", 3);
		q.setParameter("n", "john");
		
		
		//singl
		//multiple-list
		List<Student> list = q.list();
		for(Student student:list){
			System.out.println(student.getId()+":"+student.getCerti().getCourse());
		}
		//delete query
		System.out.println("________________________");
		/*Query q1=s.createQuery("delete from Student s where s.id=:h");
		q1.setParameter("h",2 );
		int r = q1.executeUpdate();
		System.out.println("deleted");
		System.out.println(r);*/
		//update query
		
Query q2 = s.createQuery("update Student set id=:c where name=:n");
		
		q2.setParameter("c", 2);
		q2.setParameter("n", "john");
		int r = q2.executeUpdate();
		System.out.println(r + "objects updated");

		
		
		
		tx.commit();
		
		//how to execute join query
		Query q3 = s
				.createQuery("select q.question ,q.qid,a.answers from Question as q INNER JOIN  q.answer as a ");

		List<Object[]> list3 = q3.getResultList();

		for (Object[] arr : list3) {
			System.out.println(Arrays.toString(arr));
		}
		sf.close();
		s.close();
	}

}
