package com.tutorialspoin.eclipselink.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Department1 {
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	
	private int id;
	private String name;
	
	
	public Department1(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public Department1() {
		super();
		// TODO Auto-generated constructor stub
	}
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
	
	
	
}
