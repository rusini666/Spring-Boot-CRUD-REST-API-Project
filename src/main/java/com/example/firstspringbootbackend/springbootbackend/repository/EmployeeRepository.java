package com.example.firstspringbootbackend.springbootbackend.repository;

import com.example.firstspringbootbackend.springbootbackend.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    // all CRUD database methods
}
