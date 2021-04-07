package com.example.demo;

import com.example.demo.primary.PrimaryService;
import com.example.demo.secondary.SecondaryService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
    @Autowired
    private PrimaryService primaryService;
    @Autowired
    private SecondaryService secondaryService;
    

    @GetMapping("/main")
    public String main(){
        return "start";
    }


    @GetMapping("/fetch")
    public String fetch(){
        secondaryService.findAll();
        primaryService.findAll();
        return "fetch";
    }
}
