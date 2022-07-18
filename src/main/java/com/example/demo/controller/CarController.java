/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.controller;

import com.example.demo.core.inter.CarInterface;
import com.example.demo.core.inter.GreetInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author DELL
 */
@RestController
@RequestMapping("/car-route")
public class CarController {
    
    @Autowired
    private CarInterface CarInterface;
    
    @Autowired
    private GreetInterface GreetInterface;
    
    @RequestMapping("/")
    public String GetCar(){
        return this.CarInterface.GetCar() + " " + this.GreetInterface.GetGreetText();
    }
}
