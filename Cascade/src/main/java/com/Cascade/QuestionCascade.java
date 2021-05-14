package com.Cascade;

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
@Table(name="CascadeQuestion")
public class QuestionCascade {
	@Id
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="qid")
	private int qid;
	private String question;
	@OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY,mappedBy = "question")
	private List<AnswerCascade> answer;
	
	
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
	
	public QuestionCascade(int qid, String question, List<AnswerCascade> answer) {
		super();
		this.qid = qid;
		this.question = question;
		this.answer = answer;
	}
	public List<AnswerCascade> getAnswer() {
		return answer;
	}
	public void setAnswer(List<AnswerCascade> answer) {
		this.answer = answer;
	}
	public QuestionCascade() {
		// TODO Auto-generated constructor stub
	}
	
	
	

}
