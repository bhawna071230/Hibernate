import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transaction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.map.Answer;
import com.map.Question;


public class MapDemo {

	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure("hconfig.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		/*Question q = new Question();
		q.setQid(1);
		q.setQuestion("what is java");
		
		Answer a = new Answer();
		a.setAid(23);
		a.setAnswers("java is a programming language");
		a.setQuestion(q);
		
		
		Answer a1 = new Answer();
		a1.setAid(12);
		a1.setAnswers("java is used in spring boot");
		a1.setQuestion(q);
		
		Answer a2 = new Answer();
		a2.setAid(22);
		a2.setAnswers("and in hibernate as well");
		a2.setQuestion(q);		
		List<Answer> list= new ArrayList<Answer>();
		list.add(a);
		list.add(a1);
		list.add(a2);
		q.setAnswer(list);*/
		Session s = sf.openSession();
		//begin transaction----------
		org.hibernate.Transaction tx = s.beginTransaction();
		Question que = (Question) s.get(Question.class, 1);
		System.out.println(que.getQuestion());
		//for(Answer ans:que.getAnswer())
		//System.out.println(ans.getAnswers());
	
		
		

		//saving session-----------
		/*s.save(q);
		s.save(a);
		s.save(a1);
		s.save(a2);*/

				
	
		

		
	
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
