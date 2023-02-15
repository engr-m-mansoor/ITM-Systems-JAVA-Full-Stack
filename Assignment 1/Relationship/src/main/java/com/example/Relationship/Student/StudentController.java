package com.example.Relationship.Student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class StudentController {
	
	@Autowired
	private StudentService service;
	
	@PostMapping(path = "/addStudent")
	public Student addStudent(@RequestBody Student s) {
		return service.saveStudent(s);
	}
	
	@GetMapping(path = "/getStudent/{id}")
	public Student getStudent(@PathVariable int id) {
		return service.getStudentById(id);
	}
	@PutMapping(path = "/updateStudent")
	public Student updateStudent(@RequestBody Student s) {
		return service.updateStudent(s);
	}
	@DeleteMapping(path = "/deleteStudent/{id}")
	public String deleteEmployee(@PathVariable int id) {
		return service.deleteStudent(id);
	}
	

}
