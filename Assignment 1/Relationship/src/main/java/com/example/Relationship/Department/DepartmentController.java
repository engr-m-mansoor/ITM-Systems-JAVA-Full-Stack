package com.example.Relationship.Department;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class DepartmentController {
	
	@Autowired
	private DepartmentService service;
	
	@PostMapping(path = "/addDepartment")
	public Department addDepartment(@RequestBody Department d) {
		return service.saveDepartment(d);
	}
	
	@GetMapping(path = "/getDepartment/{id}")
	public Department getDepartment(@PathVariable int id) {
		return service.getDepartmentById(id);
	}
	@PutMapping(path = "/updateDepartment")
	public Department updateDepartment(@RequestBody Department d) {
		return service.updateDepartment(d);
	}
	@DeleteMapping(path = "/deleteDepartment/{id}")
	public String deleteDepartment(@PathVariable int id) {
		return service.deleteDepartment(id);
	}

}
