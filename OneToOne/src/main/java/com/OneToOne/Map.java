package com.OneToOne;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class Map {

	public static void main(String[] args) {
		Question1To1 q = new Question1To1();
		
		q.setQuestion("what is z");
		
		Answer1To1 a = new Answer1To1();
	
		a.setAnswers("z is a programming language");
		a.setQuestion(q);
		q.setAnswer(a);
		//another data-----------
		
		Question1To1 q1 = new Question1To1();
		
		q1.setQuestion("what is w");
		
		Answer1To1 a1 = new Answer1To1();
	
		a1.setAnswers("w is a programming language");
		q1.setAnswer(a1);
		a1.setQuestion(q1);
		//opening session-------
		 Session s = HibernateUtil.getSessionFactory().openSession();
		 Transaction tx =  s.beginTransaction();
		
		
		//begin transaction----------
		
		//saving session-----------
		s.save(a);
		s.save(q);
		s.save(a1);
		s.save(q1);
		//fetching data
		Question1To1 newq = (Question1To1) s.get(Question1To1.class, 2);
		System.out.println(newq.getQuestion());
		System.out.println(newq.getAnswer().getAnswers());
		//commit tansaction------------
		tx.commit();
		s.close();
		HibernateUtil.getSessionFactory().close();
		
		
	

	}

}