package com.company.section5;

public class NumberPalindrome {
    public static boolean isPalindrome(int number) {
        String numberString = (number < 0 ? number*-1 : number) + "";
        return new StringBuffer(numberString).reverse().toString().equals(numberString);
    }
}
