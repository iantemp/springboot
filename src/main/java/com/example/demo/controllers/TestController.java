package com.example.demo.controllers;

import com.example.demo.domain.dto.Customer;
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
        ModelAndView mv = new ModelAndView("welcome");
        mv.addObject("customer", new Customer());
        return mv;
    }

    @Autowired
    CustomerRepository customerRepository;

    @PostMapping("/customer/save")
    @ResponseBody
    public ModelAndView saveUser(@ModelAttribute Customer form){
        customerRepository.save(toEntity(form));
        ModelAndView mv = new ModelAndView("success");
        mv.addObject(form);
        return mv;
    }

    public Customers toEntity(Customer form) {
        Customers customers = new Customers(form.getId(), form.getFirstName(), form.getLastName());
        return customers;
    }

}
