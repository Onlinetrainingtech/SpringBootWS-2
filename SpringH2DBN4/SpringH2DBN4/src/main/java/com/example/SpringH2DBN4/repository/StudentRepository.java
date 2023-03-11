package com.example.SpringH2DBN4.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.SpringH2DBN4.model.Student;

public interface  StudentRepository extends CrudRepository<Student,Integer>
{

}
