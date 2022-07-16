package com.example.demo.controller;

import com.example.demo.core.inter.GreetInterface;
import com.example.demo.model.api.*;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
public class GreetController {

    @Autowired
    GreetInterface greetSvc;

    @RequestMapping("/greet")
    public GreetResponse sayHello() {
        return greetSvc.getGreet();
    }

    @RequestMapping("/greet-list")
    public GreetListResponse sayGreetMany() {
        return new GreetListResponse();
    }

    @RequestMapping(value = "/greet", method = RequestMethod.POST)
    public boolean createGreet(@Valid @RequestBody GreetRequest greetRequest) {
        try {
            boolean result = this.greetSvc.AddAccount(greetRequest.text);
            return result;
        } catch (Exception e) {
            return false;
        }
    }

    @RequestMapping(value = "/greet/{id}", method = RequestMethod.GET)
    public int getDetailGreet(@PathVariable("id") int id) {
        return id;
    }
}
