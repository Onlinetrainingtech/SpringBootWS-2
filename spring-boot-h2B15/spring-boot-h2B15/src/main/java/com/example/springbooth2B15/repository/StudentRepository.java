package com.example.springbooth2B15.repository;


import org.springframework.data.repository.CrudRepository;

import com.example.springbooth2B15.model.*;

public interface StudentRepository extends CrudRepository<Student,Integer>
{

}
