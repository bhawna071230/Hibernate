package States;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class DemoState {
	public static void main(String args[]) {
		//states in hibernate
		//transient state
		//persistance state
		//detached state
		//remove state
		System.out.println("Example:");
		Configuration cfg = new Configuration();
		cfg.configure("hconfig.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Student stu = new Student();
		stu.setId(12);
		stu.setName("inna");
		stu.setCerti(new Certificate("java core","2 months"));
		//Student :Transient state
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();
		s.save(stu);
		//Student:persistant state-session data-base
		stu.setName("john");
		tx.commit();
		s.close();
		
		//detached-state
		sf.close();
		
		
		
		
		sf.close();
	}

}
