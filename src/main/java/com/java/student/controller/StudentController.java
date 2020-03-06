package com.java.student.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.java.student.model.Student;
import com.java.student.model.Students;

@RestController
@RequestMapping("/student")
public class StudentController {
	
	@GetMapping(value = "/get-students")
	public ResponseEntity<Students> getStudent(){
		Students students = new Students();
		students.setStudents(getAllStudent()); 
		return new ResponseEntity<Students>(students, HttpStatus.OK);
		
	}
	
	public static List<Student> getAllStudent(){
		Student s = new Student("ishu", ("30-10-1991"));
		Student s1 = new Student("ishu1", ("30-10-1990"));
		Student s2 = new Student("ishu2", ("30-10-1992"));
		Student s3 = new Student("ishu3", ("30-10-1993"));
		List<Student>students = new ArrayList<Student>(); 
		students.add(s);
		students.add(s1);
		students.add(s2);
		students.add(s3);
	return students;
	}
}
