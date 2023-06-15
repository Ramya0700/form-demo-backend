package com.example.form.backend.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.form.backend.model.Student;
import com.example.form.backend.repository.StudentJpaDao;


@Service
@Transactional
public class StudentServiceImpl implements StudentService{

	@Autowired
    private StudentJpaDao studentJpaDao;
	
	@Override
	public List<Student> getAllStudent() {
		return studentJpaDao.findAll();
	}

	@Override
	public Student findStudentById(Integer id) {
		return studentJpaDao.findById(id).get(); 
	}


	@Override
	public Student createStudent(Student student) {
		return studentJpaDao.save(student);
	}

	@Override
	public Student deleteStudent(Student id) {
		studentJpaDao.delete(id);
		 return id;
	}
	
}
