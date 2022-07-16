/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.model.api;


/**
 *
 * @author DELL
 */
public class ErrorResponse extends BaseResponse{
    public ErrorResponse(String message, int statusCode){
        super(null, message, statusCode);
    }
}