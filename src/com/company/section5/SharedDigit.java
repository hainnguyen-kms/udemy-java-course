package com.company.section5;

public class SharedDigit {
    public static boolean hasSharedDigit(int num1, int num2) {
        if(num1 < 10 || num1 > 99 || num2 < 10 || num2 > 99) return false;
        for(char c1 : (num1 + "").toCharArray()) {
            for(char c2: (num2 + "").toCharArray()) {
                if(c1 == c2) return true;
            }
        }
        return false;
    }
}
