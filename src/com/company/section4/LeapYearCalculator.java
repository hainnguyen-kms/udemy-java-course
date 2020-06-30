package com.company.section4;

public class LeapYearCalculator {
    public static boolean isLeapYear(int year) {
        if(year < 1 || year > 9999) return false;
        if(year % 4 == 0) {
            if(year % 100 == 0) {
                return year % 400 == 0;
            }
            return true;
        }
        return false;
    }
}
