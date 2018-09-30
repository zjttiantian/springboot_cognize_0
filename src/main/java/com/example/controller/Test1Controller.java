package com.example.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(method = RequestMethod.GET, path = "/test1")
public class Test1Controller {


    @RequestMapping(method = RequestMethod.GET, path = "/test")
    public String test(){
        return "OK";
    }
}
