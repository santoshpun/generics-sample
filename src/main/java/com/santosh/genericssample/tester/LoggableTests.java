package com.santosh.genericssample.tester;

import com.santosh.genericssample.Loggable;
import com.santosh.genericssample.app.ConsoleLogging;

public class LoggableTests {

    public static void main(String[] args) {
        Loggable<String> console = new ConsoleLogging<>();
        console.print("Test succeded");
    }
}
