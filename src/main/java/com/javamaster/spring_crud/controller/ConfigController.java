package com.javamaster.spring_crud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.javamaster.spring_crud.MyConfig;

@RestController
public class ConfigController {
    
    @Autowired 
    private MyConfig applicationConfig;
     
    @GetMapping(
        value = "/getConfiguration",
        produces = MediaType.APPLICATION_JSON_VALUE
    
    )
    public MyConfig getConfig(){
        return applicationConfig;
    }
}
