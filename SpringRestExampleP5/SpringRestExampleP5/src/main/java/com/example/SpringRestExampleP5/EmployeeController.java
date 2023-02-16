package com.example.SpringRestExampleP5;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

	@Autowired
	//private IEmployeeService p1;
	
	private  EmployeeService p1;
	
	@GetMapping(value="/employee")
	public List<Employee>getEmployee()
	{
		List<Employee>employees=p1.findAll();
		return employees;
	}
//	@GetMapping(path="/employee/{id}")
//	public Employee getSpecificId(@PathVariable int id)
//	{
//		return p1.findById(id);
//	}

	@GetMapping(path="employee/{id}")
	public Employee getSpecificIds(@PathVariable int id)
	{
		return p1.findBy(id);
	}
}
