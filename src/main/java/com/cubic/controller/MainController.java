package com.cubic.controller;

import com.cubic.component.AppProperties;
import com.cubic.component.GlobalProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/main")
public class MainController {
    @Autowired
    GlobalProperties globalProperties;
    @Autowired
    AppProperties appProperties;
    @GetMapping("/check")
    public String checkFeature() {

       // return globalProperties.toString();
        return "Working";
        //return "oj";//featureManager.getMetaData();
    }
    @GetMapping("/checkGlobalProperties")
    public String checkGlobalProperties() {

        return globalProperties.toString();

    }
    @GetMapping("/checkAppProperties")
    public String checkAppProperties() {

        return appProperties.toString();

    }
}
