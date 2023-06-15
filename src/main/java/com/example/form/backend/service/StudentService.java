package com.example.form.backend.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.form.backend.model.Student;

@Service
public interface StudentService {

	public List<Student> getAllStudent();
    public Student findStudentById(Integer id);
    public Student deleteStudent(Student id);
    public Student createStudent(Student student);
}
