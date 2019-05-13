package com.tutorialspoin.eclipselink.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Department3 {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)

	private int id;
	private String name;

	public Department3() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Department3(int id, String name) {
		super();
		this.id = id;
		this.name = name;
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
