package com.company.section4;

public class MinutesToYearsDaysCalculator {
    public static String INVALID_VALUE = "Invalid Value";
    public static void printYearsAndDays(long minutes) {
        if(minutes < 0) {
            System.out.println(INVALID_VALUE);
        }
        long year = minutes / (24 * 60 * 365);
        long day = minutes % (24 * 60 * 365);

        System.out.println(String.format("%s min = %s y and %s d", minutes, year, day));
    }
}
