package com.cubic.dao.impl;

import com.cubic.dao.DeptDAO;
import com.cubic.data.Dept;
import com.cubic.data.Employee;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
@Profile("prod")
public class DeptDAOUs implements DeptDAO {
    static {
        deptList.add(new Dept(1,"sales","US"));
    }
    @Override
    public List<Dept> findAll() {
        return deptList;
    }
/*
    @Override
    public Dept addDept(Dept d) {
        boolean found=false;
        for(Dept dept:deptList){
            if(dept.getdId()==d.getdId()){
                dept.setdName(d.getdName());
                dept.setLoc(d.getLoc());
                found=true;
                break;
            }
        }
        if(!found) {
            deptList.add(d);
        }
        return d;
    }

    @Override
    public void deleteDeptById(int id) {
        Dept d=null;
        for(Dept dept:deptList){
            if(dept.getdId()==id){
                d=dept;
                break;
            }
        }
        if(d!=null)
            deptList.remove(d);

    }

    @Override
    public Dept updateDept(Dept d) {
        for(Dept dept:deptList){
            if(dept.getdId()==d.getdId()){
                dept.setdName(d.getdName());
                dept.setLoc(d.getLoc());
                break;
            }
        }
        return d;
    }
*/


}
