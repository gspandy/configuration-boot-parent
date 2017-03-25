package com.janita.autoconfig.one.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Janita on 2017-03-25 11:22
 */
@RestController
@RequestMapping("/config")
public class ConfigController {

    @Autowired
    private Environment environment;

    @GetMapping
    public String testProfile(){
        return environment.getProperty("name");
    }
}
