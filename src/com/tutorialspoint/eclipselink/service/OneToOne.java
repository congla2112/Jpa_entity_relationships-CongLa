package com.tutorialspoint.eclipselink.service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.tutorialspoin.eclipselink.entity.Department3;
import com.tutorialspoin.eclipselink.entity.Employee3;

public class OneToOne {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("Jpa_entity_relationships");
		EntityManager enmanager = emfactory.createEntityManager();
		enmanager.getTransaction().begin();
		
		Department3 department3 = new Department3();
		department3.setName("Coder");
		
		enmanager.persist(department3);
		
		Employee3 employee31 = new Employee3();
		employee31.setEname("Minh");
		employee31.setSalary(50000000);
		employee31.setDeg("admin");
		employee31.setDepartment(department3);
		
		Employee3 employee32 = new Employee3();
		employee32.setEname("Vuong");
		employee32.setSalary(40000000);
		employee32.setDeg("admin");
		employee32.setDepartment(department3);
		
		Employee3 employee33 = new Employee3();
		employee33.setEname("Ha");
		employee33.setSalary(35000000);
		employee33.setDeg("admin");
		employee33.setDepartment(department3);
		
		enmanager.persist(employee31);
		enmanager.persist(employee32);
		enmanager.persist(employee33);
		
		enmanager.getTransaction().commit();
		enmanager.close();
		emfactory.close();
		
		

	}

}
