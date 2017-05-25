package com.springAndHibernate.SpringAndHibernate.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="hellolog")
public class HelloLog {

	@Id
	@GeneratedValue
	private int id;
	
	@Column (name="name")
	private String name;
	
	@Column (name="timestamp", nullable=false)
	private Date timestamp;
	
	public HelloLog(String name){
		this.name=name;
		timestamp = new Date();
		
	}
	//no argment constructor
	public HelloLog(){
		
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
	
}
