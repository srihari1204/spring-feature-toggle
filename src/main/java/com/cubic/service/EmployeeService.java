package com.cubic.service;

import com.cubic.data.Employee;

import java.util.ArrayList;
import java.util.List;

public interface EmployeeService {
  /*  Employee addEmployee(Employee e);
    void deleteEmployee(int id);
    Employee updateEmployee(Employee e);*/
  Employee findEmployeeById(int id);
    List<Employee> findAll();
}
