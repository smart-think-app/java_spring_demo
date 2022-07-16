package com.example.demo.model.api;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class BaseResponse {
    public Object Object;
    public String Message;
    public int StatusCode;
    
    public BaseResponse(Object object , String message , int code) {
        this.Object = object;
        this.Message = message;
        this.StatusCode = code;
    }
}
