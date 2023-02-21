package com.example.SpringBootH2Eve.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.SpringBootH2Eve.model.Student;
import com.example.SpringBootH2Eve.service.StudentService;

@RestController
public class StudentController
{
    //autowired the student services class
	
	@Autowired
	StudentService studentService;
	
	//creating a get mapping that retrives all the student details from db
	
	@GetMapping("/student")
	private List<Student>getAllStudent()
	{
		return studentService.getAllStudent();
	}
	
	//creating a getMapping that retrives the details of a specific student id
	@GetMapping("/student/{id}")
	private Student getStudent(@PathVariable("id")int id)
	{
		return studentService.getStudentById(id);
	}
	
	//creating a delete mapping that delete a specific record
	
	@DeleteMapping("/student/{id}")
	private void deleteStudent(@PathVariable("id")int id)
	{
		studentService.delete(id);
	}
	
	//creating post mapping that post the student details in the db
	
	@PostMapping("/student")
	private int saveStudent(@RequestBody Student student)
	{
		studentService.SaveOrUpdate(student);
		return student.getId();
	}
	
	@PutMapping("/student")
	private Student update(@RequestBody Student student)
	{
		studentService.SaveOrUpdate(student);
		return student;
	}
}
