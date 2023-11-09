package com.project.employee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.project.employee.model.Employee;
import com.project.employee.service.EmployeeService;

@Controller
public class EmployeeController {
    
    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/")
    public String getHomePage() {
        System.out.println("getHomePage fired");
        return "index";
    }

    @GetMapping("/register")
    public String registerEmployee() {
        return "register";
    }

    @PostMapping("/register_employee")
    public String registerEmployee1(@ModelAttribute Employee employee) {
        System.out.println(employee);
        employeeService.addEmployee(employee);
        return "index";
    }
}
