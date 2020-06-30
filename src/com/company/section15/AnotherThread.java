package com.company.section15;

public class AnotherThread extends Thread {
    @Override
    public void run() {
        System.out.println("2");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            System.out.println("Another thread wake me up");
        }

        System.out.println("3000s have passed and i'm awake");
    }
}
