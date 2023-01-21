package com.xyz.SpringH2DBP4.repository;


import org.springframework.data.repository.CrudRepository;

import com.xyz.SpringH2DBP4.model.Student;

public interface StudentRepository extends CrudRepository<Student,Integer>
{

}
