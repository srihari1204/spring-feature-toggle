package com.cubic.service.impl;

import com.cubic.dao.EmployeeDAO;
import com.cubic.data.Employee;
import com.cubic.service.EmployeeService;
import com.cubic.util.FeatureAssociation;
import com.cubic.util.MyFeatures;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    EmployeeDAO employeeDAO;
    @Override
    public List<Employee> findAll() {
        return employeeDAO.findAll();
    }

    @Override
    @FeatureAssociation(value = MyFeatures.EMPLOYEE_ROLE_FEATURE)
    public Employee findEmployeeById(int id) {
        System.out.println("service "+id);
        return employeeDAO.findEmployeeById(id);
    }

   /* @Override
    public Employee addEmployee(Employee e) {
        return employeeDAO.addEmployee(e);
    }

    @Override
    public void deleteEmployee(int id) {
        employeeDAO.deleteEmployeeById(id);
    }

    @Override
    public Employee updateEmployee(Employee e) {
        return employeeDAO.updateEmployee(e);
    }


    */
}
