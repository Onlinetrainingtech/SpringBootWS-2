package com.example.SpringRestExampleP5;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service

public class EmployeeService implements IEmployeeService
{

	ArrayList<Employee>employees=new ArrayList<>();
	@Override
	public List<Employee> findAll() {
		
		
		//add employee to the list
		
		employees.add(new Employee(100,"azar","bang"));
		employees.add(new Employee(101,"azar1","hyd"));
		employees.add(new Employee(102,"azar2","US"));
		
		
		return employees;
	}
//	@Override
//	public Employee findById(int id) {
//		// TODO Auto-generated method stub
//		return employees.get(id);
//	}
	
	//Reterive based on id value
	public Employee findBy(int id)
	{
		for(Employee p1:employees)
		{
			if(p1.getId()==id)
			{
				return p1;
			}
			
		}
		return null;
	}
	
	

}
