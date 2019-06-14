package com.cubic.service.impl;

import com.cubic.service.LocationService;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Service;

@ConditionalOnProperty(
        name = "feature.toggles.location.india",
        havingValue = "true"
)
@Service

public class LocationIndiaImpl implements LocationService {
    @Override
    public String getLocation() {
        return "India location";
    }
}
