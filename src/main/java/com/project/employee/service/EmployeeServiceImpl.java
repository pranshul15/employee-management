package com.project.employee.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.employee.model.Employee;
import com.project.employee.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    @Autowired
    private EmployeeRepository employeeRepository;
    
    @Override
    public void addEmployee(Employee employee) {
        employeeRepository.save(employee);
    }
    
}
