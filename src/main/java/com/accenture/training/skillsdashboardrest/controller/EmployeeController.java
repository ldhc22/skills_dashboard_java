package com.accenture.training.skillsdashboardrest.controller;

import com.accenture.training.skillsdashboardrest.model.Employee;
import com.accenture.training.skillsdashboardrest.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/employees")
public class EmployeeController {

    @Autowired
    EmployeeRepository employeeRepository;

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping(value = "", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Employee> getEmployees(@PathParam(value = "eId") String eId) {
        List<Employee> employees = new ArrayList<>();
        if(eId == null){
            employeeRepository.findAll().forEach(employees::add);
        } else {
            Optional<Employee> optional = employeeRepository.findEmployeeByeId(eId);
            if(optional.isPresent()){
                employees.add(optional.get());
            }
        }
        return employees;
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping(value = "/{sysId}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Employee getEmployeeById(@PathVariable(name = "sysId") Integer sysId) {
        Employee employee = null;
        Optional<Employee> employeeOptional = employeeRepository.findById(sysId);
        if(employeeOptional.isPresent()){
            employee = employeeOptional.get();
        }
        return employee;
    }

}
