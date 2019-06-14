package com.cubic.dao.impl;

import com.cubic.dao.DeptDAO;
import com.cubic.data.Dept;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
@Profile("qa")
public class DeptDAOInd implements DeptDAO {
    static {
        deptList.add(new Dept(1,"sales","ind"));
    }

    @Override
    public List<Dept> findAll() {
        return deptList;
    }

   /* @Override
    public Dept addDept(Dept d) {
        return null;
    }

    @Override
    public void deleteDeptById(int id) {

    }

    @Override
    public Dept updateDept(Dept d) {
        return null;
    }

*/
}
