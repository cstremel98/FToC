package com.example.ftoc;

public class Utilities {
    public static double fToC(double fahrenheit) {
        return (fahrenheit -32) / 1.8;
    }

    public static double cToF(double celsius) {
        return (celsius * 1.8) + 32;
    }
}
