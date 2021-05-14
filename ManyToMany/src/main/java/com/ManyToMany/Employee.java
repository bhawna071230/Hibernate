package com.ManyToMany;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
public class Employee {
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", name=" + name + ", projects=" + projects + "]";
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	//@JsonView
	private int eid;
	private String name;
	

	@ManyToMany
	@JoinTable(name = "emp_learn", joinColumns = { @JoinColumn(name = "eid") }, inverseJoinColumns = {
			@JoinColumn(name = "pid") })
	private List<Project1> projects;

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Project1> getProjects() {
		return projects;
	}

	public void setProjects(List<Project1> projects) {
		this.projects = projects;
	}

	public Employee(int eid, String name, List<Project1> projects) {
		super();
		this.eid = eid;
		this.name = name;
		this.projects = projects;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

}
