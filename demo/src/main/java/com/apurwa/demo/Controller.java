package com.apurwa.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.stereotype.Controller
@RequestMapping("/")
public class Controller {

    @GetMapping("")
    public static String controller1(){
        return "lending";

    }

}
