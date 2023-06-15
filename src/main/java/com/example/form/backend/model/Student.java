package com.example.form.backend.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;


@Entity
@Table(name = "people")
public class Student {

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private int id;
		
		
		@Override
		public String toString() {
			return "Student [id=" + id + ", name=" + name + ", gender=" + gender + ", course=" + course + ", phoneNumber="
					+ phoneNumber + ", email=" + email + ", dob=" + dob + ", comments=" + comments + ", notification="
					+ notification + "]";
		}

		@Column(name = "name")
		private String name;

		@Column(name = "gender")
		private String gender;
		
		@Column(name = "course")
		private String course;
		
		@Column(name = "phoneNumber")
		private Number phoneNumber;
		
		public Student(Number phoneNumber, String email) {
			super();
			this.phoneNumber = phoneNumber;
			this.email = email;
		}

		public Number getPhoneNumber() {
			return phoneNumber;
		}

		public void setPhoneNumber(Number phoneNumber) {
			this.phoneNumber = phoneNumber;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		@Column(name = "email")
		private String email;
		
		@JsonFormat(pattern = "yyyy-MM-dd")
		@Column(name = "dob")
		private Date dob = new Date();
		
		@Column(name = "comments")
		private String comments;
		
		@Column(name = "notification")
		private Boolean notification;
		
		public Student() {}
		
		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getGender() {
			return gender;
		}

		public void setGender(String gender) {
			this.gender = gender;
		}

		public String getCourse() {
			return course;
		}

		public void setCourse(String course) {
			this.course = course;
		}

		public Date getDob() {
			return dob;
		}

		public void setDob(Date dob) {
			this.dob = dob;
		}

		public String getComments() {
			return comments;
		}

		public void setComments(String comments) {
			this.comments = comments;
		}

		public Boolean getNotification() {
			return notification;
		}

		public void setNotification(Boolean notification) {
			this.notification = notification;
		}

		public Student(int id, String name, String gender, String course, Date dob, String comments,
				Boolean notification) {
			super();
			this.id = id;
			this.name = name;
			this.gender = gender;
			this.course = course;
			this.dob = dob;
			this.comments = comments;
			this.notification = notification;
		}

		
	

}
