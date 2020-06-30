package com.company.section5;

public class LargestPrime {
    public static boolean isPrimeNumber(int number) {
        int sum = 0;
        for(int i = 1; i <= number; i++) {
            if(number % i == 0) {
                sum++;
            }
            if(sum > 2) return false;
        }
        return true;
    }
    public static int getLargestPrime(int number) {
        if(number <= 1) return -1;
        for(int i = number - 1; i >= 2; i--) {
            if(isPrimeNumber(i) && (number % i == 0)) return i;
        }
        return -1;
    }
}
