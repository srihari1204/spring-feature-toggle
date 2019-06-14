package com.cubic.controller;

import com.cubic.data.Employee;
import com.cubic.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.togglz.core.manager.FeatureManager;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;
    @Autowired
    private FeatureManager featureManager;
    @GetMapping("/")
    public List<Employee> getEmployees()
    {
      return  employeeService.findAll();

    }
    @GetMapping("/{id}")
    public Employee findEmployeeById(@PathVariable("id") int id)
    {
        //System.out.println("========"+id);
        return  employeeService.findEmployeeById(id);

    }

}
