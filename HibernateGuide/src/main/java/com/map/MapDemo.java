package com.map;
import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transaction;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.map.Answer;
import com.map.Question;


public class MapDemo {
	
	@Transactional
	public static void main(String[] args) {
        
		Configuration cfg = new Configuration();
		cfg.configure("hconfig.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		/*Question q11 = new Question();
		q11.setQid(3);
		q11.setQuestion("what is java");
		
		Answer a33 = new Answer();
		a33.setAid(33);
		a33.setAnswers("java is a programming language");
		a33.setQuestion(q11);
		
		
		Answer a44 = new Answer();
		a44.setAid(135);
		a44.setAnswers("java is used in hibernate");
		a44.setQuestion(q11);
	
		Answer a55 = new Answer();
		a55.setAid(25);
		a55.setAnswers("and in spring as well");
		a55.setQuestion(q11);		
		List<Answer> list11= new ArrayList<Answer>();
		list11.add(a33);
		list11.add(a44);
		list11.add(a55);
		q11.setAnswer(list11);*/
		
		Session s = sf.openSession();
		//begin transaction----------
		org.hibernate.Transaction tx = s.beginTransaction();

		Question q = (Question) s.get(Question.class, 1212);		
		
		System.out.println(q.getQid());
		System.out.println(q.getQuestion());
		
		System.out.println(q.getAnswer().size());
		//for(Answer ans:que.getAnswer())
		//System.out.println(ans.getAnswers());
	
		
		

		//saving session-----------
		/*s.save(q11);
		s.save(a33);
		s.save(a44);
		s.save(a55);*/
		

				
	
		

		
	
		//fetching data
		//Question newq = (Question) s.get(Question.class, 2);
		//System.out.println(newq.getQuestion());
		//System.out.println(((Answer) newq.getAnswer()).getAnswers());
		//commit tansaction------------
		tx.commit();
		s.close();
		sf.close();
		
	

	}

}
