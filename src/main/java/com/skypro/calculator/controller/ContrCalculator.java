package com.skypro.calculator.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class ContrCalculator {
    @GetMapping
    public String welcome() {
        return "Добро пожаловать в калькулятор!";
    }
    public
}
