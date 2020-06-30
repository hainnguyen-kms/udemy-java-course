package com.company.section5;

public class EvenDigitSum {
    public static int getEvenDigitSum(int number) {
        if(number < 0) return -1;
        int sum = 0;

        for (char c : (number + "").toCharArray()) {
            int charNumberValue = Character.getNumericValue(c);
            if (charNumberValue % 2 == 0) {
                sum += charNumberValue;
            }
        }
        return sum;
    }
}
