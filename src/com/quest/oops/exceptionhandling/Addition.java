package com.quest.oops.exceptionhandling;

public class Addition implements Operation {
    @Override
    public double performOperation(double num1, double num2) {
        return num1 + num2;
    }

    @Override
    public String toString() {
        return "Addition";
    }
}


