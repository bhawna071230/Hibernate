package com.test.HibernateGuide;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

/**
 * Hello world! 
 *
 */
public class App {
	public static void main(String[] args) throws IOException {
		SessionFactory sf = new Configuration().configure("hconfig.xml").addAnnotatedClass(Student.class)
				.buildSessionFactory();
		System.out.println("project started");
		
		
		Student obj1 = new Student();
		obj1.setName("c");
		System.out.println(obj1);
		 
		Address ad = new Address();
		ad.setId(2);
		ad.setStreet("street2");
		ad.setCity("punjab");
		ad.setOpen(true);
		ad.setDate(new Date());
		ad.setX(231.345);
		//reading image
		FileInputStream fis= new FileInputStream("src/main/java/DQaVVTrUMAEZtNp.jpg");
		byte[] data = new byte[fis.available()];
		fis.read(data);
		ad.setImage(data);
		
		
		
	
		
		
        
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();  
		
		session.save(obj1);
		session .save(ad);
		
		
		
		
		tx.commit();
		//ServiceRegistry reg = new StandardServiceRegistryBuilder().applySettings(sf.getProperties()).build(); 
		
		session.close();
		

	}
}
