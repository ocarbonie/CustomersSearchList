package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;

@Controller
public class HomeController {
    @Autowired
    CustomerRepository customerRepository;

    @RequestMapping("/")
    public String index(Model model) {
        model.addAttribute("customers", customerRepository.findAll());
        return "index";
    }

    @PostMapping("/showResults")
    public String resultPage (@RequestParam("lastname") String lastName, Model model){
        model.addAttribute("customers", customerRepository.findByLastName(lastName));
        return "show";
        }
    }
