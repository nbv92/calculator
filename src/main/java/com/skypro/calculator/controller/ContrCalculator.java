package com.skypro.calculator.controller;
import com.skypro.calculator.service.CalcService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")

public class ContrCalculator {
    private final CalcService calcService;

    public ContrCalculator(CalcService calcService) {
        this.calcService = calcService;
    }

    @GetMapping
    public String welcome() {
        return "Добро пожаловать в калькулятор!";
    }
    @GetMapping ("/plus")
    public String plus (
            @RequestParam(name ="num1", required = false) Integer num1,
            @RequestParam(name = "num2", required = false) Integer num2
    ) {
        if (num1 == null || num2 == null) {
            return  "Введите оба числа";
        }
        return num1 + " + " + num2 + " = " + calcService.plus(num1,num2) ;
    }
    @GetMapping ("/minus")
    public String minus(
            @RequestParam(name ="num1", required = false) Integer num1,
            @RequestParam(name = "num2", required = false) Integer num2
    ) {
        return num1 + " - " + num2 + " = " + calcService.minus(num1, num2);
    }

    @GetMapping ("/multiply")
    public String multiply (
            @RequestParam(name ="num1", required = false) Integer num1,
            @RequestParam(name = "num2", required = false) Integer num2
    ) {
        return num1 + " * " + num2 + " = " + calcService.multiply(num1, num2);
    }

    @GetMapping ("/divide")
    public String divide(
            @RequestParam(name ="num1", required = false) Integer num1,
            @RequestParam(name = "num2", required = false) Integer num2
    ) {
        if (num2 == 0) {
            return "Error";
        } else {
            return num1 + " / " + num2 + " = " + calcService.divinity(num1, num2);
        }
    }
}
