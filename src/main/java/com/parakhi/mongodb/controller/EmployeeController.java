package com.parakhi.mongodb.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.parakhi.mongodb.dao.EmployeeManager;
import com.parakhi.mongodb.entity.Employee;


@RestController
@RequestMapping("/empmongo")
public class EmployeeController {

	@Autowired
	EmployeeManager employeeManager;
	@RequestMapping(value="/all",method=RequestMethod.GET)
	public List<Employee> getAll(){
		return employeeManager.getAll();
		
	}
	@RequestMapping(value="/{id}",method=RequestMethod.GET)
	public Employee getOne(@PathVariable("id") String id){
		return employeeManager.find(id);
		
	}
	
}
