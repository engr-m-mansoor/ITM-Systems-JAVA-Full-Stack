package com.example.CRUD_Operations.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.CRUD_Operations.Model.Employee;
import com.example.CRUD_Operations.Repository.Repository;

@Service
public class Services {
	
	@Autowired
	private Repository repository;
	
	
	public Employee saveEmployee(Employee e) {
		return repository.save(e);
	}
	
	public Employee getEmployeeById(int id) {
		return repository.findById(id).orElse(null);
	}
	
	public String deleteEmployee(int id) {
		repository.deleteById(id);
		return "Employee Deleted !!";
	}
	
	public Employee updateEmployee(Employee e) {
		Employee existingEmp=repository.findById(e.getId()).orElse(null);
		existingEmp.setName(e.getName());
		existingEmp.setAge(e.getAge());
		existingEmp.setSalary(e.getSalary());
		return repository.save(existingEmp);
	}
	

}
