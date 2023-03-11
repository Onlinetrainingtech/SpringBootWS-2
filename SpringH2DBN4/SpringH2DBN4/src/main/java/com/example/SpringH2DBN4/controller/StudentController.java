package com.example.SpringH2DBN4.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.SpringH2DBN4.model.Student;
import com.example.SpringH2DBN4.service.StudentService;

@RestController
public class StudentController {

	@Autowired
	StudentService studentService;
	@GetMapping("/student")
	public List<Student>getAllStudent()
	{
		return studentService.getAllStudent();
	}
	
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
