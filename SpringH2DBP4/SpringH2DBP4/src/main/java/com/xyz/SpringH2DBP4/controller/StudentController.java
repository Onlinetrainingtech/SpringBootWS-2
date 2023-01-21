package com.xyz.SpringH2DBP4.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.xyz.SpringH2DBP4.model.Student;
import com.xyz.SpringH2DBP4.service.StudentService;

@RestController
public class StudentController 
{
	//autowired the student services class
		@Autowired
		StudentService studentService;
		
		//creating a get mapping that retrives all the  student details from db
		
		@GetMapping("/student")
		private List<Student>getAllStudent()
		{
			return studentService.getAllStudent();
		}
		
		//creating a getMapping that retrivevs the details of a specific student id
		
		@GetMapping("/student/{id}")
		private Student getStudent(@PathVariable("id")int id)
		{
			return studentService.getStudentById(id);
		}
		
		//Creating a delete mapping that delete a specific record
		
		@DeleteMapping("/student/{id}")
		private void deleteStudent(@PathVariable("id")int id)
		{
			studentService.delete(id);
		}
		
		//Creating  post mapping that post the student details in the db
		
		@PostMapping("/student")
		private int saveStudent(@RequestBody Student student)
		{
			studentService.SaveOrUpdate(student);
			return student.getId();
		}
		
		//Creating put mapping that update the student detail
		
		@PutMapping("/student")
		private Student update(@RequestBody Student student)
		{
			studentService.SaveOrUpdate(student);
			return student;
		}
}
