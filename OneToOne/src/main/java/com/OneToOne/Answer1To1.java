package com.OneToOne;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="A1To1")
public class Answer1To1 {

	@Id
	@Column(name="aid")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int aid;
	private String  answers;
	@OneToOne(mappedBy="answer")
	
	private Question1To1 question;
	public Question1To1 getQuestion() {
		return question;
	}
	public void setQuestion(Question1To1 question) {
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
	public Answer1To1(int aid, String answers) {
		super();
		this.aid = aid;
		this.answers = answers;
	}
	public Answer1To1() {
		// TODO Auto-generated constructor stub
	}
}