/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.model.api;

import org.springframework.http.HttpStatus;

public class SuccessResponse extends BaseResponse{
    public SuccessResponse(Object object) {
        super(object, "Success", HttpStatus.OK.value());
    }
}
