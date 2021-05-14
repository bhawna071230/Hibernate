package sqlQuery;
import java.util.Arrays;
import java.util.List;

import org.hibernate.Hibernate;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.NativeQuery;

import com.test.HibernateGuide.Student;


@SuppressWarnings("deprecation")
public class SqlQuery {
	public static void main(String[] args) {

		Session s = HibernateUtil.getSessionFactory().openSession();
		 Transaction tx =  s.beginTransaction();

		// SQL Query
		String q = "select * from Student";

		Query nq = s.createSQLQuery(q);

		List<Student> list = nq.list();

		for (Student student : list) {
			System.out.println(student.getName()+":"+student.getCerti().getCourse());
		}
		tx.commit();
		s.close();
		HibernateUtil.getSessionFactory().close();

	}

	

	
}
