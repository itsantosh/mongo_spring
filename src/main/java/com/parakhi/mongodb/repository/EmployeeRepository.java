package com.parakhi.mongodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.parakhi.mongodb.entity.Employee;

public interface EmployeeRepository extends MongoRepository<Employee ,String>{

}
