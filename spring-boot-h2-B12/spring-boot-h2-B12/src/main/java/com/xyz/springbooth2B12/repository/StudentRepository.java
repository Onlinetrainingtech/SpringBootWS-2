package com.xyz.springbooth2B12.repository;

import org.springframework.data.repository.CrudRepository;

import com.xyz.springbooth2B12.model.Student;

public interface StudentRepository extends CrudRepository<Student,Integer>
{

}
