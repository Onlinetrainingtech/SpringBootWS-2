package com.example.SpringBootH2Eve.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.SpringBootH2Eve.model.Student;

public interface StudentRepository extends CrudRepository<Student,Integer>
{

}
