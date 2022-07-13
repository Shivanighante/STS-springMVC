package com.jbk.service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jbk.dao.EmployeeDao;
import com.jbk.entity.Employee;
@Service
public class EmployeeService_imp implements EmployeeService {
	
	@Autowired 
	 private EmployeeDao dao;//interface clss la autowired kel internally it work as( Studentdao dao=new Studentdao_imp)
		//logic tr dao clss madhe it call as contoller-->Service-->dao.
		
		
		
		
		
		@Override
		public Employee saveemployee(Employee emplyoee) {
			String employeeId= new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
			emplyoee.setEmpId(employeeId);
			Employee std=dao.saveEmployee(emplyoee);//only calling from dao
			return std;
		}

		@Override
		public Employee gettemployeeById(String employeeId) {
			 Employee emplyoee=dao.gettudentById(employeeId);
			return emplyoee;
		}

		
		

		@Override
		public boolean deleteemployeeById(String employeeId) {
		boolean b=dao.deleteEmployeeById(employeeId);
			return b;
		}

		@Override
		public Employee updateemplyoee(Employee emplyoee) {
			Employee std= dao.updateEmployee(emplyoee);
			return std;
		}

		@Override
		public List<Employee> getAllemployee() {
			List<Employee>list= dao.getAllemployee();
			return list;
		}

		@Override
		public List<Employee> getAllemplyoee() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public Employee login(Employee employee) {
			Employee emp=dao.login(employee);
			return emp;
		}

		
		


	
}
