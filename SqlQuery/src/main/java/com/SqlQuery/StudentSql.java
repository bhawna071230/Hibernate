package com.SqlQuery;


import javax.persistence.Cacheable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Cacheable
@Cache(usage=CacheConcurrencyStrategy.READ_ONLY)
@Table(name="StudentSql")
public class StudentSql {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public StudentSql(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	
	
	public StudentSql() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return this.id+" :" +  this.name+" :";
	}
	
	
	

}
