package com.example.rentacar.service;

import com.example.rentacar.demoapplication.model.Student;
import com.example.rentacar.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class StudentServiceImpl implements StudentService {

	@Autowired(required=true)
	StudentRepository studentRepository;
	

	public Student save(Student student) {
		return this.studentRepository.save(student);
	}

}
