package com.example.Relationship.Department;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class DepartmentService {
	
	@Autowired
	private DepartmentRepository repository;
	public Department saveDepartment(Department d) {
		return repository.save(d);
	}
	
	public Department getDepartmentById(int id) {
		return repository.findById(id).orElse(null);
	}
	
	public String deleteDepartment(int id) {
		repository.deleteById(id);
		return "Department Deleted !!";
	}
	
	public Department updateDepartment(Department d) {
		Department existingDtd=repository.findById(d.getId()).orElse(null);
		existingDtd.setName(d.getName());
		return repository.save(existingDtd);
	}

}
