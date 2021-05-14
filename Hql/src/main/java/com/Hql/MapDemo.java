package com.Hql;
import java.util.ArrayList;
import java.util.List;
import javax.transaction.Transactional;
import org.hibernate.Session;
import org.hibernate.Transaction;



public class MapDemo {
	
	@Transactional
	public static void main(String[] args) {
        
		QuestionHql q111 = new QuestionHql();
		
		q111.setQuestion("what is python");
		
		AnswerHql a333 = new AnswerHql(); 
		
		a333.setAnswer("python is a programming language");
		a333.setQuestion(q111);
		
		
		AnswerHql a444 = new AnswerHql();
		
		a444.setAnswer("py is used in ML");
		a444.setQuestion(q111);
	
		AnswerHql a555 = new AnswerHql();
		
		a555.setAnswer("andh in AI as well");
		a555.setQuestion(q111);		
		List<AnswerHql> list11= new ArrayList<AnswerHql>();
		list11.add(a333);
		list11.add(a444);
		list11.add(a555);
		q111.setAnswer(list11);
		
		Session s = HibernateUtil.getSessionFactory().openSession();
		Transaction tx =  s.beginTransaction();
		
		
		
		
		
		
		

		//saving session-----------
		s.save(q111);
		s.save(a333);
		s.save(a444);
		s.save(a555);
		
		
		tx.commit();
		//fetching................

		QuestionHql ques = s.get(QuestionHql.class, 1);
		System.out.println(ques.getQuestion()+":"+ques.getQid());

		for (AnswerHql answer : ques.getAnswer()) {
			System.out.println(answer.getAnswer());
		}
		

				
	
		

		
	
		//fetching data
		//Question newq = (Question) s.get(Question.class, 2);
		//System.out.println(newq.getQuestion());
		//System.out.println(((Answer) newq.getAnswer()).getAnswers());
		
		
		s.close();
		HibernateUtil.getSessionFactory().close();
	

	}
}
