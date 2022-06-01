package com.DEMOJWT.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @RequestMapping("home")
    public String helloWorld(@RequestParam(value = "name") String name) {
        return "Bienvenido al sistema " + name + "!!";
    }
}
