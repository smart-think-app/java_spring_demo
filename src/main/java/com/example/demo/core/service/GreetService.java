package com.example.demo.core.service;

import com.example.demo.model.api.GreetResponse;
import com.example.demo.core.inter.*;
import com.example.demo.core.inter.repo.AccountRepoInterface;
import com.example.demo.model.api.AccountListResponse;
import com.example.demo.model.entity.Account;
import java.util.ArrayList;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GreetService implements GreetInterface {

    private static final Logger logger = LoggerFactory.getLogger(GreetService.class);
    @Autowired
    private AccountRepoInterface AccountRepoInterface;
    
    @Override
    public GreetResponse getGreet() {
        Thread t1 = new Thread(() -> {
            System.out.println("Hello World");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
            }
            System.out.println("Hello World");
        });
        t1.start();
        return new GreetResponse("Hello World");
    }

    @Override
    public boolean AddAccount(String text) {
        try {
            boolean result = this.AccountRepoInterface.Insert(text);
            return result;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public List<AccountListResponse> GetListAccounts() {
        try {
            logger.info("Hello");
            List<Account> accounts = this.AccountRepoInterface.GetAccounts();
            List<AccountListResponse> response = new ArrayList<>();
            for (Account acc : accounts) {
                response.add(new AccountListResponse(acc.getName(), acc.getId()));
            }
            return response;
        } catch (Exception e) {
            return new ArrayList<>();
        }
    }
}
