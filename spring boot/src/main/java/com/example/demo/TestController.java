package com.example.demo;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(method = RequestMethod.GET, path = "/test")
public class TestController {


    @RequestMapping(method = RequestMethod.GET, path = "/test")
    public String test(){
        return "OK";
    }
}
