package com.map;
import java.util.ArrayList;
import java.util.List;
import javax.transaction.Transactional;
import org.hibernate.Session;
import org.hibernate.Transaction;
import com.map.Answer;
import com.map.Question;


public class MapDemo {
	
	@Transactional
	public static void main(String[] args) {
        
		Question q11 = new Question();
	
		q11.setQuestion("what is dynamic programming");
		
		Answer a33 = new Answer();
		
		a33.setAnswers(" is a programming language");
		a33.setQuestion(q11);
		
		
		Answer a44 = new Answer();
		
		a44.setAnswers("it is used in ");
		a44.setQuestion(q11);
	
		Answer a55 = new Answer();
		
		a55.setAnswers("and in runtime as well");
		a55.setQuestion(q11);		
		List<Answer> list11= new ArrayList<Answer>();
		list11.add(a33);
		list11.add(a44);
		list11.add(a55);
		q11.setAnswer(list11);
		
		Session s = HibernateUtil.getSessionFactory().openSession();
		Transaction tx =  s.beginTransaction();
		
		
		
		
		
		
		

		//saving session-----------
		s.save(q11);
		s.save(a33);
		s.save(a44);
		s.save(a55);
		
		
		tx.commit();
		//fetching................

		Question ques = s.get(Question.class, 1);
		System.out.println(ques.getQuestion()+":"+ques.getQid());

		for (Answer answer : ques.getAnswer()) {
			System.out.println(answer.getAnswers());
		}
		

				
	
		

		
	
		//fetching data
		//Question newq = (Question) s.get(Question.class, 2);
		//System.out.println(newq.getQuestion());
		//System.out.println(((Answer) newq.getAnswer()).getAnswers());
		
		
		s.close();
		HibernateUtil.getSessionFactory().close();
	

	}
}
