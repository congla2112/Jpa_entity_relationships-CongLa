package com.tutorialspoin.eclipselink.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Employee3 {
	
	
	@Id
	@GeneratedValue(strategy =  GenerationType.AUTO)
	
	
	private int eid;
	private String ename;
	private int salary;
	private String deg;
	
	@OneToOne
	private Department3 department;

	public Employee3() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee3(int eid, String ename, int salary, String deg) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.salary = salary;
		this.deg = deg;
		
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getDeg() {
		return deg;
	}

	public void setDeg(String deg) {
		this.deg = deg;
	}

	public Department3 getDepartment() {
		return department;
	}

	public void setDepartment(Department3 department) {
		this.department = department;
	}
	
	

}
