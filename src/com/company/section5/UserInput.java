package com.company.section5;

import java.util.Scanner;

public class UserInput {
    public static void readUserInput() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your year of birth: ");
        int yearOfBirth = scanner.nextInt();

        scanner.nextLine();
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();

        System.out.println(name +"-"+ yearOfBirth);

        scanner.close();
    }
}
