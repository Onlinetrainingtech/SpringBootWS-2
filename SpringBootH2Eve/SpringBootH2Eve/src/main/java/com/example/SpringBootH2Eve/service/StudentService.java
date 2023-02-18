package com.example.SpringBootH2Eve.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.SpringBootH2Eve.model.Student;
import com.example.SpringBootH2Eve.repository.StudentRepository;

@Service
public class StudentService 
{
	@Autowired
    StudentRepository studentRepository;
	
	//getting all the student data
	
	public List<Student>getAllStudent()
	{
		List<Student>students=new ArrayList<>();
		
		return students;
	}
	
	//getting a specific record
	
	public Student getStudentById(int id)
	{
		return studentRepository.findById(id).get();
	}
	
	//save your data
	
	public void SaveOrUpdate(Student student)
	{
		studentRepository.save(student);
	}
	
	//deleting the specific data
	
	public void delete(int id)
	{
		studentRepository.deleteById(id);
	}
	
	//update the data
	
	public void update(Student student,int id)
	{
		studentRepository.save(student);
	}
}
