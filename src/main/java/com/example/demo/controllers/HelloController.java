package com.example.demo.controllers;

import com.example.demo.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Evgeny Borisov
 */
@RestController

public class HelloController {


    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }


    @PostMapping("/person/{amount}")
    public List<Person> people(@RequestBody Person person, @PathVariable int amount) {
        return null;
    }


}
