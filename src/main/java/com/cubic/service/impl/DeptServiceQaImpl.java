package com.cubic.service.impl;

import com.cubic.dao.DeptDAO;
import com.cubic.data.Dept;
import com.cubic.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@Profile("qa")
public class DeptServiceQaImpl implements DeptService {
    @Autowired
    DeptDAO deptDAO;
    @Override
    public List<Dept> findAll() {
        return deptDAO.findAll();
    }
}
