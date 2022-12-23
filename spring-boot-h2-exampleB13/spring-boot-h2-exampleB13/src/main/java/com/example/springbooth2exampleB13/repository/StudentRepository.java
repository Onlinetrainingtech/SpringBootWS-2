package com.example.springbooth2exampleB13.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.springbooth2exampleB13.model.Student;

public interface StudentRepository extends CrudRepository<Student,Integer>
{

}
