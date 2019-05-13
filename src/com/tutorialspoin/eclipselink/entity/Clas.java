package com.tutorialspoin.eclipselink.entity;

import java.util.List;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;

@Entity
public class Clas {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	private int cid;
	private String cname;
	
	@ManyToMany(targetEntity = Teacher.class)
	private List teacherSet;

	public Clas() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Clas(int cid, String cname, List teacherSet) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.teacherSet = teacherSet;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public List getTeacherSet() {
		return teacherSet;
	}

	public void setTeacherSet(List teacherSet) {
		this.teacherSet = teacherSet;
	}

	
	
	
	
}
