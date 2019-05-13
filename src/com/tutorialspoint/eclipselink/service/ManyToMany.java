package com.tutorialspoint.eclipselink.service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.tutorialspoin.eclipselink.entity.Clas;
import com.tutorialspoin.eclipselink.entity.Teacher;

public class ManyToMany {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("Jpa_entity_relationships");
		EntityManager enmanager = emfactory.createEntityManager();
		enmanager.getTransaction().begin();
		
		Clas clas1 = new Clas(4, "10a", null);
		Clas clas2 = new Clas(5, "11a", null);
		Clas clas3 = new Clas(6, "12a", null);
		
		enmanager.persist(clas1);
		enmanager.persist(clas2);
		enmanager.persist(clas3);
		
		List<Clas> listClas = new ArrayList<>();
		listClas.add(clas1);
		listClas.add(clas2);
		listClas.add(clas3);
		
		Teacher teacher1 = new Teacher(0, "Loan", "Java", listClas);
		Teacher teacher2 = new Teacher(0, "Chien", "Php", listClas);
		Teacher teacher3 = new Teacher(0, "Toan", "Sql", listClas);
		
		enmanager.persist(teacher1);
		enmanager.persist(teacher2);
		enmanager.persist(teacher3);
		
		enmanager.getTransaction().commit();
		enmanager.close();
		emfactory.close();
		
		
		
		

	}

}
