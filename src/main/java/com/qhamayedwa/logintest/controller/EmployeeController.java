package com.qhamayedwa.logintest.controller;

import com.qhamayedwa.logintest.model.Employee;
import com.qhamayedwa.logintest.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
@CrossOrigin
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/add")
    public String add(@RequestBody Employee employee){
        employeeService.saveEmployee(employee);
        //System.out.println("Employee saved: " + savedEmployee.getName());
        return "New employee added";
    }
    @GetMapping("/getAll")
    public List<Employee> list(){
        return employeeService.getAllEmployees();
    }
}
