package com.company.section4;

public class AreaCalculator {
    public static double area(double radius) {
        return radius >= 0 ? radius * radius * Math.PI : -1.0d;
    }

    public static double area(double x, double y) {
        return ((x >= 0) && (y >= 0))? x * y : -1.0d;
    }
}
