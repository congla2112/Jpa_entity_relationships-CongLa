package com.tutorialspoin.eclipselink.entity;

import java.util.List;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Teacher {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)

	private int tid;
	private String tname;
	private String subject;

	@ManyToMany(targetEntity = Clas.class)
	private List clasSet;

	public Teacher() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Teacher(int tid, String tname, String subject, List clasSet) {
		super();
		this.tid = tid;
		this.tname = tname;
		this.subject = subject;
		this.clasSet = clasSet;
	}

	public int getTid() {
		return tid;
	}

	public void setTid(int tid) {
		this.tid = tid;
	}

	public String getTname() {
		return tname;
	}

	public void setTname(String tname) {
		this.tname = tname;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public List getClasSet() {
		return clasSet;
	}

	public void setClasSet(List clasSet) {
		this.clasSet = clasSet;
	}

}
