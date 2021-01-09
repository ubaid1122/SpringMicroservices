package com.learnMicroservices.limitsservice.Controller;

import com.learnMicroservices.limitsservice.Bean.LimitConfiguration;
import com.learnMicroservices.limitsservice.Component.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsConfigurationController {
    @Autowired
    private Configuration configuration;

    @GetMapping("/limits")
    public LimitConfiguration retriveLimitsFromConfigurations()
    {
        //getting values from the properties file
        return new LimitConfiguration(configuration.getMaximum(), configuration.getMinimum());
    }
}
