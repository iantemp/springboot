package com.example.demo.controllers;

import com.example.demo.domain.dto.Customers;
import com.example.demo.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by Ian Gabriel on 7/13/2017.
 */
@RestController
public class TestController {

    @GetMapping("/welcome")
    public ModelAndView firstPage(){
        return new ModelAndView("welcome");
    }

    @Autowired
    CustomerRepository customerRepository;

    @GetMapping("customer/save")
    public void saveUser(){
        Customers customer = new Customers(0L,"ian","dela cruz");
        customerRepository.save(customer);
    }

}
