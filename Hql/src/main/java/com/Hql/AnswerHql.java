package com.Hql;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


@Entity
public class AnswerHql {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="aid")
	private int aid;
	private String  answer;
	@ManyToOne
	private QuestionHql question;
	 
	public AnswerHql(int aid, String answer, QuestionHql question) {
		super();
		this.aid = aid;
		this.answer = answer;
		this.question = question;
	}
	public QuestionHql getQuestion() {
		return question;
	}
	public void setQuestion(QuestionHql question) { 
		this.question = question;
	}
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public AnswerHql() {
		// TODO Auto-generated constructor stub
	}

}
