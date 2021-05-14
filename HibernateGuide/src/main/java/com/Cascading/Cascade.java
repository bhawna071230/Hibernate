package com.Cascading;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.map.Answer;
import com.map.Question;

public class Cascade {
	@Transactional
	public static void main(String[] args) {

		SessionFactory factory = new Configuration().configure("hconfig.xml").buildSessionFactory();

		Session s = factory.openSession();
		Question q1 = new Question();
		q1.setQid(123454);
		q1.setQuestion("what is swing framwork");
		
		Answer a3 = new Answer();
		a3.setAid(231124);
		a3.setAnswers("use for development");
		Answer a4 = new Answer(); 
		a4.setAid(2313243);
		a4.setAnswers("Desktop based"); 
		Answer a5 = new Answer();
		a5.setAid(2314563);
		a5.setAnswers("learning program language");
		List<Answer> list = new ArrayList<>();
		list.add(a3);
		list.add(a4);
		list.add(a5);
		
		q1.setAnswer(list); 
		Transaction tx = s.beginTransaction();
		s.save(q1);
	
		
		
		tx.commit();
		s.close();

}}
