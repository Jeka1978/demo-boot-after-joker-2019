package com.example.demo.controllers;

import com.example.demo.model.Person;
import com.example.demostarterjoker.FrontendController;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author Evgeny Borisov
 */
@FrontendController
public class FController {
    @GetMapping("/p2")
    public Person person(){
        return  Person.builder().age(12).build();
    }
}
