package com.santosh.genericssample.app;


import com.santosh.genericssample.Calculation;

public class Addition implements Calculation {
    @Override
    public int calculate(int a, int b) {
        return a + b;
    }
}
