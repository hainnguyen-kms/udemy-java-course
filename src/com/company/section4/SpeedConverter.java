package com.company.section4;

public class SpeedConverter {
    public static void printConversion(double kilometersPerHour) {
        long miles = toMilesPerHour(kilometersPerHour);
        if(miles == -1) {
            System.out.println("Invalid Value");
        } else {
            System.out.println(kilometersPerHour + " km/h = " + miles + " mi/h");
        }
    }
    public static long toMilesPerHour(double kilometersPerHour) {
        if(kilometersPerHour < 0) return -1;
        return Math.round(kilometersPerHour / 1.609);
    }
}
