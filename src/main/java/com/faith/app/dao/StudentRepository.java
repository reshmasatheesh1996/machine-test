package com.faith.app.dao;

import org.springframework.data.repository.CrudRepository;

import com.faith.app.entity.Student;

public interface StudentRepository extends CrudRepository<Student,Integer> {

}
