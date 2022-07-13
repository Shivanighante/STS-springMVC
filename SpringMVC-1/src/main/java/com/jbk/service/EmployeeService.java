package com.jbk.service;

import java.util.List;


import com.jbk.entity.Employee;


public interface EmployeeService {
	
	public Employee login(Employee employee);
	
		public Employee  saveemployee (Employee employee);
		public Employee  gettemployeeById(String employeeId);
		public List<Employee> getAllemployee();
		public boolean deleteemployeeById(String  employeeId);
		public Employee  updateemplyoee (Employee employee);
		List<Employee> getAllemplyoee();
}