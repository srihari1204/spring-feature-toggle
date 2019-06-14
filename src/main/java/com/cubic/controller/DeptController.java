package com.cubic.controller;

import com.cubic.data.Dept;
import com.cubic.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/dept")
@ConditionalOnProperty(name = "feature.toggles.dept", havingValue = "true")
public class DeptController {
    @Autowired
    DeptService deptService;

    @GetMapping("/")
    public List<Dept> getDept(){
        return deptService.findAll();
    }

}
