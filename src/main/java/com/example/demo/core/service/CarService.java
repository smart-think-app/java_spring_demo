/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.core.service;

import com.example.demo.core.inter.CarInterface;
import org.springframework.stereotype.Service;

/**
 *
 * @author DELL
 */
@Service
public class CarService implements CarInterface{

    @Override
    public String GetCar() {
        return "Car" ;
    }
    
}
