package com.tutorialspoin.eclipselink.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Department2 {
	
	@Id
	@GeneratedValue(strategy =GenerationType.AUTO)
	
	
	private int id;
	private String name;
	
	
	@OneToMany(targetEntity = Employee2.class)
	private List employeelist2;


	public Department2() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Department2(int id, String name) {
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


	public List getEmployeelist2() {
		return employeelist2;
	}


	public void setEmployeelist2(List employeelist2) {
		this.employeelist2 = employeelist2;
	}
	
	
}
