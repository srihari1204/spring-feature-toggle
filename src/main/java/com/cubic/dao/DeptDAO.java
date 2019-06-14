package com.cubic.dao;

import com.cubic.data.Dept;
import com.cubic.data.Employee;

import java.util.ArrayList;
import java.util.List;

public interface DeptDAO {
    static List<Dept> deptList=new ArrayList<>();
   /* Dept addDept(Dept d);
    void deleteDeptById(int id);
    Dept updateDept(Dept d);*/
    List<Dept> findAll();

}
