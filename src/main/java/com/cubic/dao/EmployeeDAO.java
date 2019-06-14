package com.cubic.dao;

import com.cubic.data.Employee;

import java.util.ArrayList;
import java.util.List;

public interface EmployeeDAO {
    static List<Employee> employeeList=new ArrayList<>();
/*    Employee addEmployee(Employee e);
    void deleteEmployeeById(int id);
    Employee updateEmployee(Employee e);*/

    Employee findEmployeeById(int id);
    List<Employee> findAll();
    }
