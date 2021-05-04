package com.example.log.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.log.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}