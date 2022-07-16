package com.example.demo.model.api;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class GreetListResponse {
    public GreetResponse[] DataGreet;
    public GreetListResponse(){
        this.DataGreet = new GreetResponse[2];
        this.DataGreet[0] = new GreetResponse("Hello");
        this.DataGreet[1] = new GreetResponse("Hello 1");
    }
}
