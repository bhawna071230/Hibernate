package com.quack;

import java.util.ArrayList;
import java.util.List;

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
        
    	 SessionFactory sf =   new Configuration().configure("hconfig.xml").buildSessionFactory();
    	
    	 Session session = sf.openSession();
    	 
    	 Transaction tx = session.beginTransaction();
    	 
    	 Person p = new Person();
    	 p.setName("Bhawna");
    	 
    	 List<Car> mylist = new ArrayList<Car>();
    	 Car c =new Car();
    	 c.setModel("Maruti");
    	 c.setPerson(p);
    	 mylist.add(c);
    	 
    	 c =new Car();
    	 c.setModel("Honda");
    	 c.setPerson(p);
    	 mylist.add(c);
    	 
    	 p.setCar(mylist);
    	 
    	 session.save(p);
    	 //timet o run
    	 //don't woryy didn't remember phone numerb xD
    	 
    	 //yeh match karlena apne waaale se 
    	 //bye
    	 
    	 tx.commit();
    	 
    	 session.close();
    	
    	
    }
}
