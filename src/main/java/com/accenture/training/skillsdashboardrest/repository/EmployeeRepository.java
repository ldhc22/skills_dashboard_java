package com.accenture.training.skillsdashboardrest.repository;

import com.accenture.training.skillsdashboardrest.model.Employee;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface EmployeeRepository extends CrudRepository<Employee, Integer> {
    Optional<Employee> findEmployeeByeId(String eId);
}
