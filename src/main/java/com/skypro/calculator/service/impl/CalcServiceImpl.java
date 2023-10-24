package com.skypro.calculator.service.impl;

import com.skypro.calculator.service.CalcService;
import org.springframework.stereotype.Service;

@Service
public class CalcServiceImpl implements CalcService {

    @Override
    public String plus(int num1, int num2) {
        return num1 + " + " + num2 + " = " + num1 + num2;
    }

    @Override
    public String minus(int num1, int num2) {
        return num1 + " - " + num2 + " = " + num1 + (-1 * num2);//
    }

    @Override
    public String multiply(int num1, int num2) {
        return num1 + " * " + num2 + " = " + num1 * num2;
    }

    @Override
    public String divinity(int num1, int num2) {
        return num1 + " / " + num2 + " = " + num1 / num2;
    }
}
