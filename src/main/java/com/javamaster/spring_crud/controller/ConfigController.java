package com.javamaster.spring_crud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javamaster.spring_crud.ApplicationConfig;

@RestController
public class ConfigController {
    
    @Autowired 
    private ApplicationConfig applicationConfig;
     
    @GetMapping(
        value = "/CONSULCONFIG",
        produces = MediaType.APPLICATION_JSON_VALUE
    
    )
    public ApplicationConfig getConfig(){
        return applicationConfig;
    }
}
