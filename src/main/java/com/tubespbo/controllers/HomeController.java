package com.tubespbo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tubespbo.service.ProductService;
import org.springframework.ui.Model;

@Controller
@RequestMapping("")

public class HomeController {
    @Autowired
    private ProductService productService;

    @GetMapping
    public String welcome(Model model) {
        model.addAttribute("products", productService.findAll());
        return "index";
    }
}
