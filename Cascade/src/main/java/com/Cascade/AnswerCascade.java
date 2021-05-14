package com.Cascade;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="CascadeAnswer")
public class AnswerCascade {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="aid")
	private int aid;
	private String  answers;
	@ManyToOne(fetch = FetchType.EAGER)
	QuestionCascade question;
	
	public AnswerCascade(int aid, String answers, QuestionCascade question) {
		super();
		this.aid = aid;
		this.answers = answers;
		this.question = question;
	}
	public QuestionCascade getQuestion() {
		return question;
	}
	public void setQuestion(QuestionCascade question) { 
		this.question = question;
	}
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getAnswers() {
		return answers;
	}
	public void setAnswers(String answers) {
		this.answers = answers;
	}

	public AnswerCascade() {
		// TODO Auto-generated constructor stub
	}

}
