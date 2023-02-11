package com.jsp.controller;

import com.jsp.dto.Employee;
import com.jsp.services.Services;

public class Controller {
public static void main(String[] args) {
	Employee employee = new  Employee();
	employee.setId(8);
	employee.setName("snehaa");
	employee.setEmail("sneha@123");
	employee.setSal(300000);

	//insert
	Services services = new Services();
	services.saveEmployee(employee);
	
	//delete
	Employee deleteEmployee = new Employee();
	deleteEmployee.setId(8);
	// services.deleteEmployee(deleteEmployee);
	
	//update
	Employee updateEmployee= new Employee() ;
    updateEmployee.setId(2);
    updateEmployee.setName("pratu");
    //services.updateEmployee(employee);
     
     //getalldetails
     //services.allDetails();
}
}
