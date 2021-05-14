package com.CriteriaApi;

import javax.persistence.Embeddable;

@Embeddable
public class CertificateCriteriaApi {
	private String course;
	private String duration;
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	public CertificateCriteriaApi() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CertificateCriteriaApi(String course, String duration) {
		super();
		this.course = course;
		this.duration = duration;
	}
	


}
