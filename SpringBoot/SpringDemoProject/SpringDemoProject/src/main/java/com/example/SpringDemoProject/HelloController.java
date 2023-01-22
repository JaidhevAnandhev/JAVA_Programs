package com.example.SpringDemoProject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/")
    public String helloFunction(){
        String output = "Welcome to SpringBoot";
        return output;
    }

}
