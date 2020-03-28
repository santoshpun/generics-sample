package com.santosh.genericssample.tester;

import com.santosh.genericssample.app.Addition;
import com.santosh.genericssample.app.CalculationOperation;
import com.santosh.genericssample.app.Subtraction;

public class CalculationTests {

    public static void main(String[] args) {
        CalculationOperation<Addition> additionCalculationOperation = new CalculationOperation<>(new Addition());
        additionCalculationOperation.printResult(5, 2);

        CalculationOperation<?> subtractionCalculationOperation = new CalculationOperation<>(new Subtraction());
        subtractionCalculationOperation.printResult(5, 2);
    }
}
