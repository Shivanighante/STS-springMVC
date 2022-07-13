package com.jbk.dao;

import java.util.List;

import javax.transaction.Transaction;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;
import org.hibernate.criterion.SimpleExpression;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jbk.entity.Employee;
@Repository
public class EmployeeDao_imp implements EmployeeDao {
@Autowired
private SessionFactory sf;
	@Override
	public Employee saveEmployee(Employee Employee) {
	Session session=sf.openSession();	
	 org.hibernate.Transaction tr= session.beginTransaction();
	 try {
		 session.save(Employee);
		 tr.commit();
		
	} catch (Exception e) {
		e.printStackTrace();
	return null;
	}
	 finally {
		session.close();
	}
		return Employee;
	}

	@Override
	public Employee gettudentById(String Employeeid) {
		Session session=sf.openSession();
		Employee Employee= null;
		try {
		 Employee =	session.get(Employee.class, Employeeid);
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			session.close();
		}
		return Employee;
	}

	@Override
	public List<Employee> getAllEmployee() {
		Session session=sf.openSession();
	List<Employee> list= null;
		try {
		Criteria cr=session.createCriteria(Employee.class);//wjole list print then use critria
		list= cr.list();
		} catch (Exception e) {
		e.printStackTrace();
		}
		finally {
			session.close();
		}
		return list;
	}

	@Override
	public boolean deleteEmployeeById(String EmployeeId) {
		Session session=sf.openSession();
		org.hibernate.Transaction tr= session.beginTransaction();
		boolean b = false;
		
		try {
			Employee Employee=session.load(Employee.class, EmployeeId);//delete can be done by load method
			if(Employee!=null) {
			session.delete(Employee);
			tr.commit();
			b=true;}
		} catch (Exception e) {
			e.printStackTrace();
		b=false;
		}finally {
			session.close();
		}
		return b;
	}

	@Override
	public Employee updateEmployee(Employee Employee) {
		Session session=sf.openSession();
		Transaction tr=(Transaction) session.beginTransaction();
		Employee std=null;
		try {
		std=	session.get(Employee.class, Employee.getEmpId());
		session.update(Employee);
		tr.commit();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		return std;
	}

	@Override
	public List<Employee> getAllemployee() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee login(Employee employee) {
		Session session=sf.openSession();
		Employee emp=null;
		try {
			Criteria cr=session.createCriteria(Employee.class);
			Criterion userName=  Restrictions.eq("userName", employee.getUserName());

			Criterion password=  Restrictions.eq("password", employee.getPassword());
			cr.add(Restrictions.and(userName,password));
			
			
			
			
			
			 emp=(Employee) cr.uniqueResult();
		} catch (Exception e) {
		e.printStackTrace();
		} finally {
			session.close();
		}
		return emp ;
	}

}
