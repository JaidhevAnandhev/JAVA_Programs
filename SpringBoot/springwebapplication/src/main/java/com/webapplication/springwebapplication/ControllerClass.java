package com.webapplication.springwebapplication;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ControllerClass {
    // Creating a method to display the output
    @RequestMapping("/")
    public String control(){
        System.out.println("Welcome to SpringBoot");
        return "Web";
    }


}
