package com.example.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by Ian Gabriel on 7/13/2017.
 */
public class TestController {

    @RequestMapping("/welcome.html")
    public ModelAndView firstPage(){
        return new ModelAndView("welcome");
    }
}
