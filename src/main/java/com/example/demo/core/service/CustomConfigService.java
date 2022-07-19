/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.core.service;

import com.example.demo.core.inter.CustomConfigInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

/**
 *
 * @author DELL
 */
@Component
public class CustomConfigService implements CustomConfigInterface{
    @Autowired
    private Environment Environment;
    
    private String AppEnv;
    
    public CustomConfigService(){
    }

    @Override
    public String GetAppEnv() {
        return this.Environment.getProperty("app.environment");
    }
    
    
}
