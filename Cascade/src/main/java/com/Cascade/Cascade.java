package com.Cascade;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class Cascade {
	 
	public static void main(String[] args) {

   	
	
		QuestionCascade q1 = new QuestionCascade();
		
		q1.setQuestion("what is spring framwork");
		List<AnswerCascade> list = new ArrayList<>();
		AnswerCascade a3 = new AnswerCascade();
		a3.setAnswers("use for java development");
		a3.setQuestion(q1);
		list.add(a3);
		AnswerCascade a4 = new AnswerCascade(); 
		a4.setAnswers("Desktop based"); 
		a4.setQuestion(q1);
		list.add(a4);
		AnswerCascade a5 = new AnswerCascade();
		a5.setAnswers("learning program language");
		a5.setQuestion(q1);
		list.add(a5);
	
		q1.setAnswer(list); 
		//begin transaction----------
		
		 Session s = HibernateUtil.getSessionFactory().openSession();
		 Transaction tx =  s.beginTransaction();
		
		
		  s.save(q1);
		  
		
		  tx.commit();
	    	 
	    	 s.close();
	    	 HibernateUtil.getSessionFactory().close();
		

}}
