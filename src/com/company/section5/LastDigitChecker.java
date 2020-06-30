package com.company.section5;

public class LastDigitChecker {
    public static boolean isValid(int number) {
        return number >= 10 && number <= 1000;
    }
    public static boolean hasSameLastDigit(int num1, int num2, int num3) {
        if(!isValid(num1) || !isValid(num2) || !isValid(num3)) return false;
        char lastDigitNum1 = (num1 + "").charAt((num1 + "").length() - 1);
        char lastDigitNum2 = (num2 + "").charAt((num2 + "").length() - 1);
        char lastDigitNum3 = (num3 + "").charAt((num3 + "").length() - 1);
        return lastDigitNum1 == lastDigitNum2 || lastDigitNum1 == lastDigitNum3 || lastDigitNum2 == lastDigitNum3;
    }
}
