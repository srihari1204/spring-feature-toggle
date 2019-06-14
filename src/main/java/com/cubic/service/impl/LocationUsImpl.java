package com.cubic.service.impl;

import com.cubic.service.LocationService;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Service;

@ConditionalOnProperty(
        name = "feature.toggles.location.india",
        havingValue = "false",
        matchIfMissing = true
)

@Service
public class LocationUsImpl implements LocationService {
    @Override
    public String getLocation() {
        return "Us Location";
    }
}
