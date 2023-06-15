package com.example.form.backend.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.form.backend.config.AuthenticationBean;
import com.example.form.backend.model.Student;
import com.example.form.backend.service.EmailSender;
import com.example.form.backend.service.StudentServiceImpl;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/v1/")
public class StudentController {
		
		@Autowired
	    private StudentServiceImpl studentService;
		


	    @GetMapping("getAll")
	    public List<Student> getAllStudent(){
	        return (List<Student>) studentService.getAllStudent();
	    }

	    @GetMapping("people/{id}")
	    public Student getStudentById(@PathVariable Integer id){
	        return studentService.findStudentById(id);
	    }


	    @DeleteMapping("del/people/{id}")
		public String deleteStudentById(@PathVariable(value = "id") Integer id)  {
	    	Student student = studentService.findStudentById(id);
	    	studentService.deleteStudent(student);
			return "Employee Deleted Successfully";
		}
		
	    
	    @GetMapping(path = "basicauth")
	    public AuthenticationBean basicauth() {
	        return new AuthenticationBean("You are authenticated");
	    }
}
