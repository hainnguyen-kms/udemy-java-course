package com.company.section5;

public class DiagonalStar {
    public static void printSquareStar(int number) {
        if(number < 5) {
            System.out.println("Invalid Value");
            return;
        }

        for(int i = 0; i < number; i++) {
            for(int j = 0 ; j < number; j++) {
                if(
                        i == 0 || j == 0
                        || i == number - 1 || j == number -1
                        || i == j
                        || j == number - 1 -i
                ) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
                if(j == number - 1) {
                    System.out.println();
                }
            }
        }
    }
}
