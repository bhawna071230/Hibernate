package com.OneToOne;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name="Q1To1")
public class Question1To1 {



	@Id
	@Column(name="qid")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int qid;
	private String question;
	@OneToOne
	@JoinColumn(name="aid")
	private Answer1To1 answer;
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
	public Answer1To1 getAnswer() {
		return answer;
	}
	public void setAnswer(Answer1To1 answer) {
		this.answer = answer;
	}
	public Question1To1(int qid, String question, Answer1To1 answer) {
		super();
		this.qid = qid;
		this.question = question;
		this.answer = answer;
	}
	public Question1To1() {
		// TODO Auto-generated constructor stub
	}
}
	
