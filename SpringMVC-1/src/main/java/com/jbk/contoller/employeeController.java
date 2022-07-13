package com.jbk.contoller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.jbk.entity.Employee;
import com.jbk.service.EmployeeService;



@Controller
@RequestMapping
public class employeeController {
	@Autowired private EmployeeService service;

	@PostMapping("/loginProcess")
	public ModelAndView loginProcess(@ModelAttribute Employee employee, Model model)  {
		System.out.println(employee);
		Employee emp= service.login(employee);
		if (emp!=null) {
			
			return new ModelAndView("home");
		
		}
		else {
			return new ModelAndView("login","msg","inviald credentail");
		}
	
		
	}
	
	
	@PostMapping("/saveemployee")
	public ModelAndView saveemployee (@ModelAttribute Employee employee){
		return null;
		
		 }
		 

	
	
	
	@GetMapping("/gettemployeeById/{employeeId}")
	public ResponseEntity<Employee> getemployeebyId(@PathVariable String employeeId){
		return null;
	}

	
	
	
	
	
	@GetMapping("/ getAllemployee")
	public ResponseEntity<List<Employee>>  getAllemployee(){
		return null;
	
}
	
	
	
	
	
	
	@DeleteMapping("/deleteemployeeById/{employeeId}")
	public ResponseEntity<String> deleteemployeeById(@PathVariable String employeeId ){
		return null;
			}
	
	
	
	
	
	
	
	
	@PutMapping("/updateemployee")
	public ResponseEntity<Employee> updateemployee(@RequestBody Employee employee){
		return null;
	
	 }
		
	}

	
	
	
	
	
		
	