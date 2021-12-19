package com.company.service;

import com.company.entity.Operation;

public class CalculatorService {
    public Operation sum(double a, double b){
        return new Operation(a, b, "sum", a + b);
    }

    public Operation sub(double a, double b){
        return new Operation(a, b, "sub", a - b);
    }

    public Operation mul(double a, double b){
        return new Operation(a, b, "mul", a * b);
    }

    public Operation div(double a, double b){
        return new Operation(a, b, "div", a / b);
    }
}
