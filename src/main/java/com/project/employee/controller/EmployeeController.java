package com.project.employee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.project.employee.model.Employee;
import com.project.employee.service.EmployeeService;

@Controller
public class EmployeeController {
    
    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/")
    public String getHomePage(Model model) {
        java.util.List<Employee> employees = employeeService.getAllEmployee();
        model.addAttribute("listEmployees",employees);
        return "index";
    }

    @GetMapping("/register")
    public String registerEmployee() {
        return "register";
    }

    @PostMapping("/register_employee")
    public String registerEmployee1(@ModelAttribute Employee employee) {
        // System.out.println(employee);
        employeeService.addEmployee(employee);
        return "redirect:/";
    }

    @GetMapping("/delete/{id}")
    public String delete_employee(@PathVariable("id") Integer id) {
        employeeService.deleteEmployee(id);
        return "redirect:/";
    }

    @GetMapping("/update/{id}")
    public String update_employee(@PathVariable("id") Integer id, Model model) {
        Employee emp = employeeService.getEmployeeById(id);
        model.addAttribute("employee", emp);
        return "employee_update";
    }

    @PostMapping("/update/update_employee")
    public String update_employee_impl(@ModelAttribute Employee employee) {
        employeeService.updateEmployee(employee);
        return "redirect:/";
    }
}
