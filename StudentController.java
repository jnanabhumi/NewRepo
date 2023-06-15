package com.google.students.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.google.students.model.Student;
import com.google.students.service.StudentService;

@RestController
public class StudentController {
	
	
	@Autowired
	private StudentService studentService;
	
	
	@GetMapping("/student")
	public List<Student> getStuents()
	{
		return studentService.getStuents();
	}
	
	@GetMapping("/student"+"/{studentId}")
	public Student getStudents(@PathVariable  Integer studentId)
	{
		return studentService.getStudents(studentId);
	}
	
	@PostMapping("/student")
	public Student addStudent(@RequestBody Student student)
	{
		return studentService.addStudent(student);
	}
	
	@PutMapping("/student")
	public Student updateStudent(@RequestBody Student student)
	{
		return studentService.updateStudent(student);
	}
	
	@GetMapping("/student"+"/{studentId}" + "/{name}")
	public List<Student> getStudent(@PathVariable  Integer studentId,@PathVariable String name)
	{
		return studentService.getStudent(studentId,name);
	}
	
}
