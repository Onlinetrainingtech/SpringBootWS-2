package com.example.SpringBootH2DBB14.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.SpringBootH2DBB14.model.Student;

public interface StudentRepository extends CrudRepository<Student,Integer>
{

}
