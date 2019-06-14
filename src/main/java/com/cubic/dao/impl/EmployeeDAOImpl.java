package com.cubic.dao.impl;

import com.cubic.dao.EmployeeDAO;
import com.cubic.data.Employee;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {
    static {
        employeeList.add(new Employee(1,"ram",1000));
        employeeList.add(new Employee(2,"raj",2000));
    }
    @Override
    public Employee findEmployeeById(int id) {
        Employee employee=new Employee();
        for(Employee e:employeeList){
            if(e.getId()==id){
                employee=e;
                break;
            }
        }
        return employee;
    }
    @Override
    public List<Employee> findAll() {
        return employeeList;
    }
    /*
    @Override
    public Employee addEmployee(Employee e) {
        boolean found=false;
        for(Employee emp:employeeList){
            if(emp.getId()==e.getId()){
                emp.setName(e.getName());
                emp.setSal(e.getSal());
                found=true;
                break;
            }
        }
        if(!found) {
            deptList.add(d);
        }
        return e;
    }

    @Override
    public void deleteEmployeeById(int id) {
        Employee e=null;
        for(Employee emp:employeeList){
            if(emp.getId()==id){
                e=emp;
                break;
            }
        }
        if(e!=null)
        employeeList.remove(e);
    }

    @Override
    public Employee updateEmployee(Employee e) {
        for(Employee emp:employeeList){
            if(emp.getId()==e.getId()){
                emp.setName(e.getName());
                break;
            }
        }
        return e;
    }


   */
}
