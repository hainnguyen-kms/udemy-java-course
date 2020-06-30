package com.company.section5;

public class NumberToWords {
    public static void numberToWords(int number) {
        if(number < 0) {
            System.out.println("Invalid Value");
            return;
        }
        for(char c : (number + "").toCharArray()) {
            printNumberInWord(Character.getNumericValue(c));
        }
    }

    public static int getDigitCount(int number) {
        if(number < 0) return -1;
        return (number + "").length();
    }

    public static int reverse(int number) {
        boolean isNegativeNumber = number < 0;
        int reverseNumber = Integer.parseInt(new StringBuffer((isNegativeNumber ? (-1*number) : number)+"").reverse().toString());
        return isNegativeNumber ? reverseNumber * -1 : reverseNumber;
    }

    public static void printNumberInWord(int number) {
        String numberName;
        switch (number) {
            case 0: numberName = "Zero"; break;
            case 1: numberName = "One"; break;
            case 2: numberName = "Two"; break;
            case 3: numberName = "Three"; break;
            case 4: numberName = "Four"; break;
            case 5: numberName = "Five"; break;
            case 6: numberName = "Six"; break;
            case 7: numberName = "Seven"; break;
            case 8: numberName = "Eight"; break;
            case 9: numberName = "Nine"; break;
            default: numberName = "Other"; break;
        }
        System.out.println(numberName);
    }
}
