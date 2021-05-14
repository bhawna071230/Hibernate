package com.map;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


@Entity
public class Answer {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="aid")
	private int aid;
	private String  answers;
	@ManyToOne
	private Question question;
	
	public Answer(int aid, String answers, Question question) {
		super();
		this.aid = aid;
		this.answers = answers;
		this.question = question;
	}
	public Question getQuestion() {
		return question;
	}
	public void setQuestion(Question question) { 
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

	public Answer() {
		// TODO Auto-generated constructor stub
	}

}
