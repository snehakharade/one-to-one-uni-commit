package com.jsp.services;

import com.jsp.dao.EmployeeDao;
import com.jsp.dto.Employee;

public class Services {
EmployeeDao ed= new EmployeeDao();

public Employee saveEmployee(Employee employee) {
	return ed.saveEmployee(employee);
}

public Employee deleteEmployee(Employee employee) {
	return ed.deleteEmployee(employee);
}
 public Employee updateEmployee(Employee employee){
	 return ed.updateEmployee(employee);
	 
 }
 
 public void allDetails() {
	 ed.allDetails();
 }
}
