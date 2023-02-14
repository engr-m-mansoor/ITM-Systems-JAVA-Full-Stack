package com.example.CRUD_Operations.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.CRUD_Operations.Model.Employee;
import com.example.CRUD_Operations.Service.Services;

@RestController
public class Controller {
	@Autowired
	private Services service;
	
	@PostMapping(path = "/addEmployee")
	public Employee addEmployee(@RequestBody Employee e) {
		return service.saveEmployee(e);
	}
	
	@GetMapping(path = "/getEmployee/{id}")
	public Employee getEmployee(@RequestParam int id) {
		return service.getEmployeeById(id);
	}
	@PutMapping(path = "/updateEmployee")
	public Employee updateEmployee(@RequestBody Employee e) {
		return service.updateEmployee(e);
	}
	@DeleteMapping(path = "/deleteEmployee/{id}")
	public String deleteEmployee(@PathVariable int id) {
		return service.deleteEmployee(id);
	}
}