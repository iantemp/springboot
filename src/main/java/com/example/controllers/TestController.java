package com.example.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by Ian Gabriel on 7/13/2017.
 */
@RestController
public class TestController {

    @RequestMapping("/welcome")
    public ModelAndView firstPage(){
        return new ModelAndView("welcome.html");
    }
}
