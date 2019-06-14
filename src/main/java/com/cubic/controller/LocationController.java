package com.cubic.controller;

import com.cubic.service.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.togglz.core.util.Strings;

@RestController
@RequestMapping("/loc")
public class LocationController {
    @Autowired
    LocationService locationService;
    @GetMapping("/")
    public String getLocation(){
        return locationService.getLocation();
    }
}
