package com.Hql;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="questionhql")
public class QuestionHql {
	@Id
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="qid")
	private int qid;
	private String question;
	@OneToMany(mappedBy="question", fetch = FetchType.EAGER)
	private List<AnswerHql> answer;
	
	
	public int getQid() {
		return qid;
	}
	public void setQid(int qid) {
		this.qid = qid;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	
	public QuestionHql(int qid, String question, List<AnswerHql> answer) {
		super();
		this.qid = qid;
		this.question = question;
		this.answer = answer;
	}
	public List<AnswerHql> getAnswer() {
		return answer;
	}
	public void setAnswer(List<AnswerHql> answer) {
		this.answer = answer;
	}
	public QuestionHql() {
		// TODO Auto-generated constructor stub
	}
	
	

}
