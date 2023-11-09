package com.project.employee.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EmployeeController {
    
    @GetMapping("/")
    public String getHomePage() {
        System.out.println("getHomePage fired");
        return "index";
    }

}
