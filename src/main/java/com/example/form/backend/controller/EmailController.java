package com.example.form.backend.controller;

import javax.mail.MessagingException;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.form.backend.model.Student;
import com.example.form.backend.service.EmailSender;
import com.example.form.backend.service.StudentServiceImpl;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/v1/")
public class EmailController {


		@Autowired
		private EmailSender notificationService;
		
		@Autowired
	    private StudentServiceImpl studentService;
		
		@PostMapping("people")
	    public Student createStudent(@Valid @RequestBody Student student) throws MessagingException{
	    	student.setEmail(student.getEmail()); //Receiver's email address
			try {
				notificationService.sendEmailWithAttachment(student);
			} catch (MailException mailException) {
				System.out.println(mailException);
			}
	        return studentService.createStudent(student);
	    }
		
}
