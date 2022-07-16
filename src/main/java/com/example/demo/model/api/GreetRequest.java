package com.example.demo.model.api;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class GreetRequest {
    public String text;
    public int age;
    public GreetRequest(){
        
    }
}
