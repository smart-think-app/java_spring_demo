/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.core.service;

import com.example.demo.core.inter.CustomConfigInterface;
import javax.inject.Inject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

/**
 *
 * @author DELL
 */
@Component
public class CustomConfigService implements CustomConfigInterface{
    private Environment Environment;
    
    private String AppEnv;
    
    @Inject
    public CustomConfigService(Environment Environment){
        this.Environment = Environment;
        this.AppEnv = this.Environment.getProperty("app.environment");
    }

    @Override
    public String GetAppEnv() {
        return this.AppEnv;
    }
    
    
}
