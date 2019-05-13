package com.tutorialspoint.eclipselink.service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.tutorialspoin.eclipselink.entity.Department1;
import com.tutorialspoin.eclipselink.entity.Employee1;

public class ManyToOne {

	public static void main(String[] args) {
		
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("Jpa_entity_relationships");
		EntityManager enmanager = emfactory.createEntityManager();
		enmanager.getTransaction().begin();
		
		Department1 department1 =new Department1();
		department1.setName("department");
		
		enmanager.persist(department1);
		
		Employee1 employee1 = new Employee1();
		employee1.setEname("cong");
		employee1.setSalary(25000000);
		employee1.setDeg("Admin");
		employee1.setDepartment(department1);
		
		Employee1 employee2 = new Employee1();
		employee2.setEname("tan");
		employee2.setSalary(5000000);
		employee2.setDeg("Admin");
		employee2.setDepartment(department1);
		
		Employee1 employee3 = new Employee1();
		employee3.setEname("thuong");
		employee3.setSalary(2000000);
		employee3.setDeg("Admin");
		employee3.setDepartment(department1);
		
		
		enmanager.persist(employee1);
		enmanager.persist(employee2);
		enmanager.persist(employee3);
		
		enmanager.getTransaction().commit();
		enmanager.close();
		emfactory.close();
		

	}

}
