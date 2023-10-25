package com.skypro.calculator.service.impl;

import com.skypro.calculator.service.CalcService;
import org.springframework.stereotype.Service;

@Service
public class CalcServiceImpl implements CalcService {

    @Override
    public int plus(int num1, int num2) {
        return num1 + num2;
    }

    @Override
    public int minus(int num1, int num2) {
        return num1 - num2;//
    }

    @Override
    public int multiply(int num1, int num2) {
        return num1 * num2;
    }

    @Override
    public int divinity(int num1, int num2) {
        return num1 / num2;
    }
}
