package com.company.section5;

import java.util.Scanner;

public class InputCalculator {
    public static void inputThenPrintSumAndAverage() {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        while(true) {
            if(scanner.hasNextInt()) {
                sum += scanner.nextInt();
                count++;
            } else {
                break;
            }
        }
        System.out.println(String.format("SUM = %s AVG = %s", sum, count != 0 ? Math.round((double) sum / (double) count) : 0));
    }
}
