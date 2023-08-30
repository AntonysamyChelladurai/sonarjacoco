package com.jbeans.sonarjacoco.controller;

import com.jbeans.sonarjacoco.service.MessageService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/msg")
public class Displaymsg {

    MessageService msgser;

    @GetMapping("/color/{code}")
    public String getColor(@PathVariable String code){
       String color= msgser.getColor(code);
       return color;
    }
    @GetMapping("/shape/{code}")
    public String getShape(@PathVariable String code){
        String shape= msgser.getShape(code);
        return shape;
    }
}
