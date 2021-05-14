package com.Fproj.project;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	newProj obj = new newProj();
    	obj.setColor("red");
    	obj.setId(101);
    	obj.setName("bhawna");
    	Configuration con = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(newProj.class);
    	SessionFactory sf = con.buildSessionFactory();
    	Session session = sf.openSession();
    	Transaction tf = session.beginTransaction();
    	session.save(obj);
    	tf.commit();
    			
  
    }
}
