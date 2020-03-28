package com.santosh.genericssample.app;

import com.santosh.genericssample.Calculation;

public class Subtraction implements Calculation {
    @Override
    public int calculate(int a, int b) {
        return a - b;
    }
}
