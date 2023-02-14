package com.example.CRUD_Operations.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.CRUD_Operations.Model.Employee;

public interface Repository extends JpaRepository<Employee, Integer> {
	
	Employee findByName(String name);

}