package com.company.section4;

public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double a, double b) {
        return (int) (a * 1000d) == (int) (b * 1000d);
    }
}
