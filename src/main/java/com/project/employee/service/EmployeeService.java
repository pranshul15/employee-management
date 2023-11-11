package com.project.employee.service;

import com.project.employee.model.Employee;

public interface EmployeeService {
    java.util.List<Employee> getAllEmployee();
    Employee getEmployeeById(Integer id);
    void addEmployee(Employee employee);
    void deleteEmployee(Integer id);
    void updateEmployee(Employee employee);
}
