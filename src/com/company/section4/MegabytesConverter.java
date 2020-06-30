package com.company.section4;

public class MegabytesConverter {
    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        if(kiloBytes < 0) {
            System.out.println("Invalid Value");
            return;
        }
        int megabyte = kiloBytes / 1024;
        int remainKilobyte = kiloBytes % 1024;
        System.out.println(kiloBytes + " KB = " + megabyte + " MB and " + remainKilobyte + " KB");
    }
}
