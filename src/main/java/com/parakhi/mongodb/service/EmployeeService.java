package com.parakhi.mongodb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.parakhi.mongodb.dao.EmployeeManager;
import com.parakhi.mongodb.entity.Employee;
import com.parakhi.mongodb.repository.EmployeeRepository;

public class EmployeeService implements EmployeeManager{

	@Autowired
	EmployeeRepository employeeRepository;
	
	@Override
	public Employee addNew(Employee t) {
		
		return this.employeeRepository.save(t);
	}

	@Override
	public List<Employee> addAll(List<Employee> t) {
		 return this.employeeRepository.save(t);
	}

	@Override
	public Employee update(Employee t) {
		
		return this.employeeRepository.save(t);
	}

	@Override
	public Employee remove(Employee t) {
		
		t=employeeRepository.findOne(t.getId());
		if(t!=null){
			
			this.employeeRepository.delete(t);
			return t;
			
		}
		
		throw new IllegalArgumentException("Employee not found");
	}

	@Override
	public void removeBy(String id) {
		
		Employee t=this.employeeRepository.findOne(id);
		if(t!=null){
			this.employeeRepository.delete(id);
		}
		
		
	}

	@Override
	public Employee find(String id) {
		return employeeRepository.findOne(id);
		}

	@Override
	public List<Employee> getAll() {
		return this.employeeRepository.findAll();
	}

}
