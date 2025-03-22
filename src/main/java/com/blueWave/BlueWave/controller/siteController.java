package com.blueWave.BlueWave.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping
public class siteController {


    @GetMapping("/submitForm")
    public String showForm(){
        return "/submitForm";
    }


    @GetMapping("/sucesso")
    public String sucesso(){
        return "sucesso";
    }

    @GetMapping("/")
    public String home(){

        return "/index";
    }

    @GetMapping("/login")
    public String login(){
        return "/login";
    }

}
