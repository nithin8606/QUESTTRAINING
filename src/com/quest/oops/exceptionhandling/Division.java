package com.quest.oops.exceptionhandling;

public class Division implements Operation {
    @Override
    public double performOperation(double num1, double num2) throws ArithmeticException {
        if (num2 == 0) {
            throw new ArithmeticException("Cannot divide by zero.");
        }
        return num1 / num2;
    }

    @Override
    public String toString() {
        return "Division Operation";
    }
}

