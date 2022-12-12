package com.example.Primi_passiPrimaAPI03.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/strings")
public class StringController {

    @GetMapping("/")
    public String stringConc(@RequestParam(value = "string1") String string1, @RequestParam(required = false, value = "string2") String string2){

        if (string2 == null){

            return string1;
        }

        if (string1 == null ){

            return "Error first param..";
        }

        else{

            return string1 + " " + string2;
        }
    }
}
