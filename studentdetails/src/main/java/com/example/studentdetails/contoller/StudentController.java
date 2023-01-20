package com.example.studentdetails.contoller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.studentdetails.entity.Student;
import com.example.studentdetails.service.StudentService;

@RestController
@RequestMapping("/students")
public class StudentController {
	
	@Autowired
	private StudentService service;
	
	@GetMapping("/get/{id}")
	public Student getStudent(@PathVariable int id) {
		return service.getById(id);
	}
	
	@GetMapping("/getall")
	public List<Student> getAll() {
		return service.getAll();
	}

}
