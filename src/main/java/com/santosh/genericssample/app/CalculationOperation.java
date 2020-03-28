package com.santosh.genericssample.app;

import com.santosh.genericssample.Calculation;

import java.util.List;

public class CalculationOperation<T extends Calculation> {
    T operation;

    public CalculationOperation(T operation) {
        this.operation = operation;
    }

    public void printResult(int a, int b) {
        int result = operation.calculate(a, b);
        System.out.println("Result : " + result);
    }

    public void processOperations(List<? extends Calculation> ops) {

    }
}
