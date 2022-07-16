/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.utils;

import com.example.demo.core.inter.CustomCoreInterface;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Component;

/**
 *
 * @author DELL
 */
@Component
public class CustomCore implements CustomCoreInterface{
    @Override
    public String GetJSONObject(Object object) throws Exception{
         ObjectMapper mapper = new ObjectMapper();
         return mapper.writeValueAsString(object);
    }
}
