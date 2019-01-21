package com.example.rentacar.repository;

import org.springframework.data.repository.Repository;

import com.example.rentacar.demoapplication.model.Student;

public interface StudentRepository extends Repository<Student, Integer> {

	Student save(Student student);
}
