package com.ifmojava.dplmprjct.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SomeController {

    @RequestMapping("/")
    public String index(){
        return "index";
    }
}
