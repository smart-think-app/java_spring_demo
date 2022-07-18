/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.core.inter;

import com.example.demo.model.api.AccountListResponse;
import com.example.demo.model.api.GreetResponse;
import java.util.List;

/**
 *
 * @author DELL
 */
public interface GreetInterface {
    GreetResponse getGreet();
    public boolean AddAccount(String text);
    public List<AccountListResponse> GetListAccounts();
    public String GetGreetText();
}
