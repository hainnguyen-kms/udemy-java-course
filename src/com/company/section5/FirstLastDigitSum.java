package com.company.section5;

public class FirstLastDigitSum {
    public static int sumFirstAndLastDigit(int number) {
        if(number < 0) return -1;
        String stringNumber = number + "";
        int firstNumber =  Character.getNumericValue(stringNumber.charAt(0));
        int lastNumber = Character.getNumericValue(stringNumber.charAt(stringNumber.length()-1));
        return firstNumber + lastNumber;
    }
}
