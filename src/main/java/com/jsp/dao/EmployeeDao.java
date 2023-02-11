package com.jsp.dao;




import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jsp.dto.Employee;




public class EmployeeDao {

	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("sneha");
	EntityManager entityManager= entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction= entityManager.getTransaction();
	
	//INSERT
	public Employee saveEmployee(Employee employee) {
		entityTransaction.begin();
		entityManager.persist(employee);
		entityTransaction.commit();
		System.out.println("ALL GOOD");
		return employee;
	}
	
    //DELETE
	public Employee deleteEmployee(Employee employee) {
		Employee del =entityManager.find(Employee.class, employee.getId());
		
		entityTransaction.begin();
		entityManager.remove(del);
		entityTransaction.commit();
		System.out.println(("DELETED"));
		return employee;
	}
	 
	//UPDATE
	public Employee updateEmployee(Employee employee) {
		Employee update= entityManager.find(Employee.class, employee.getId());
		if(update != null) {
			update.setName(update.getName());
			entityTransaction.begin();
			entityManager.merge(update);
			entityTransaction.commit();
			System.out.println("UPDATED");
		}
		else {
			System.out.println("NOT FOUND");
	}
	  return employee;  
}
	public void allDetails() {
		String sql="Select e from Employee e";
		Query query = entityManager.createNativeQuery(sql);
	    List<Employee> list = query.getResultList();
		for(Employee e: list) {
			System.out.println(e.getId());
			System.out.println(e.getEmail());
			System.out.println(e.getName());
			System.out.println(e.getSal());
		}
	}
}

