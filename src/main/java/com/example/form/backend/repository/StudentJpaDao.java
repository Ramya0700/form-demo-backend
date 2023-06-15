package com.example.form.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.form.backend.model.Student;


@Repository
public interface StudentJpaDao extends JpaRepository<Student, Integer>{

}
