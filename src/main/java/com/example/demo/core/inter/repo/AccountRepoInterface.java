/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.core.inter.repo;

import com.example.demo.model.entity.Account;
import java.util.List;

/**
 *
 * @author DELL
 */
public interface AccountRepoInterface {
    public boolean Insert(String name);
    public List<Account> GetAccounts();
}
