package com.santosh.genericssample.app;

import com.santosh.genericssample.Loggable;

public class ConsoleLogging<T> implements Loggable<T> {

    @Override
    public void print(T t) {
        System.out.println("Console printing happened : "+t);
    }
}
