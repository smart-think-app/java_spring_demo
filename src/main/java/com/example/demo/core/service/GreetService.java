package com.example.demo.core.service;

import com.example.demo.async.PrintRunnable;
import com.example.demo.async.PrintThread;
import com.example.demo.model.api.GreetResponse;
import com.example.demo.core.inter.*;
import com.example.demo.core.inter.repo.AccountRepoInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.stereotype.Service;

@Service
public class GreetService implements GreetInterface {

    @Autowired
    private AccountRepoInterface AccountRepoInterface;
    
    @Override
    public GreetResponse getGreet() {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello World");
                try {
                    Thread.sleep(5000);
                } catch (Exception e) {
                }
                System.out.println("Hello World");
            }
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
}
