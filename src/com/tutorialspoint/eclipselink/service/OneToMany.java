package com.tutorialspoint.eclipselink.service;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.tutorialspoin.eclipselink.entity.Department2;
import com.tutorialspoin.eclipselink.entity.Employee2;

public class OneToMany {

	
	public static void main(String[] args) {
		
		EntityManagerFactory emfactory =Persistence.createEntityManagerFactory("Jpa_entity_relationships");
		EntityManager enmanager = emfactory.createEntityManager();
		enmanager.getTransaction().begin();
		
		Employee2 employee2 = new Employee2();
		employee2.setEname("May");
		employee2.setSalary(15000000);
		employee2.setDeg("admin");
		
		Employee2 employee3 = new Employee2();
		employee3.setEname("Trang");
		employee3.setSalary(25000000);
		employee3.setDeg("aadmin1");
		
		Employee2 employee4 = new Employee2();
		employee4.setEname("NgAnh");
		employee4.setSalary(35000000);
		employee4.setDeg("admin2");
		
		enmanager.persist(employee2);
		enmanager.persist(employee3);
		enmanager.persist(employee4);
		
		List<Employee2>list = new ArrayList<>();
		list.add(employee2);
		list.add(employee3);
		list.add(employee4);
		
		Department2 department2 = new Department2();
		department2.setName("Dev");
		department2.setEmployeelist2(list);
		
		enmanager.persist(department2);
		
		enmanager.getTransaction().commit();
		enmanager.close();
		emfactory.close();
		
		
	}

}
