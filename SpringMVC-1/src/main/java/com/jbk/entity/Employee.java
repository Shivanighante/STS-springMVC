package com.jbk.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
public class Employee {


@Id	
private String empId;
private String userName;
private String password;
private long salary;
private String department;
private String status="inactive";
private String role;
private Date createdDate;
public Employee() {
	super();
	
}
public Employee(String empId, String userName, String password, long salary, String department, String status,
		String role, Date createdDate) {
	super();
	this.empId = empId;
	this.userName = userName;
	this.password = password;
	this.salary = salary;
	this.department = department;
	this.status = status;
	this.role = role;
	this.createdDate = createdDate;
}
public String getEmpId() {
	return empId;
}
public void setEmpId(String empId) {
	this.empId = empId;
}
public String getUserName() {
	return userName;
}
public void setUserName(String userName) {
	this.userName = userName;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public long getSalary() {
	return salary;
}
public void setSalary(long salary) {
	this.salary = salary;
}
public String getDepartment() {
	return department;
}
public void setDepartment(String department) {
	this.department = department;
}
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}
public String getRole() {
	return role;
}
public void setRole(String role) {
	this.role = role;
}
public Date getCreatedDate() {
	return createdDate;
}
public void setCreatedDate(Date createdDate) {
	this.createdDate = createdDate;
}
@Override
public String toString() {
	return "Employee [empId=" + empId + ", userName=" + userName + ", password=" + password + ", salary=" + salary
			+ ", department=" + department + ", status=" + status + ", role=" + role + ", createdDate=" + createdDate
			+ "]";
}



}




	







