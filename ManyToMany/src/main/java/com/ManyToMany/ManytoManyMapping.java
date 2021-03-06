 package com.ManyToMany;

 import java.util.ArrayList;
 import java.util.List;

 import org.hibernate.Session;
 import org.hibernate.Transaction;

 public class ManytoManyMapping 
 {
     public static void main( String[] args )
     {
         Employee e1 = new Employee();
         Employee e2 = new Employee();
         
         Project1 p1 = new Project1();
         Project1 p2 = new Project1();
         Project1 p3 = new Project1();
         
         
         e1.setName("krishna");
         
        
         e2.setName("isha");
         
      
         p1.setProjectName("chat boxxing");
         
        
         p2.setProjectName("library managment system");
         
         
         p3.setProjectName("web application system");
         
         List<Project1> projList = new ArrayList<Project1>();
         projList.add(p1);
         projList.add(p2);
         
         e1.setProjects(projList);
         
         
         List<Employee> empList = new ArrayList<Employee>();
         empList.add(e1);
         empList.add(e2);
         
         p3.setEmps(empList);
         
         
         Session session = HibernateUtil.getSessionFactory().openSession();
 		Transaction tx = session.beginTransaction();
 		
 		//Saving........
 		session.save(e1);
 		session.save(e2);
 		session.save(p1);
 		session.save(p2);
 		session.save(p3);
 		
 		tx.commit();
 		
 		//fetching.........
 		
 		//All projects hold by emp1
 		
 		Employee em = session.get(Employee.class, 1);
 		List<Project1> p = em.getProjects();
 		for (Project1 projects : p) {
 			System.out.println(projects.getProjectName());
 		}
 		
 		
 		//All employees working on given project id
 		Project1 pro = session.get(Project1.class, 2);
 		for (Employee e : pro.getEmps()) {
 			System.out.println(e);
 			
 		}
 		
 		
 		session.close();
 		HibernateUtil.getSessionFactory().close();
         
     }
 }