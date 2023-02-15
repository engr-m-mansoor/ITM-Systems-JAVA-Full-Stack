package com.example.Relationship.Student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class StudentService {
	
	@Autowired
	private StudentRepository repository;
	public Student saveStudent(Student s) {
		return repository.save(s);
	}
	
	public Student getStudentById(int id) {
		return repository.findById(id).orElse(null);
	}
	
	public String deleteStudent(int id) {
		repository.deleteById(id);
		return "Student Deleted !!";
	}
	
	public Student updateStudent(Student s) {
		Student existingStd=repository.findById(s.getId()).orElse(null);
		existingStd.setName(s.getName());
		existingStd.setAge(s.getAge());
		return repository.save(existingStd);
	}

}
