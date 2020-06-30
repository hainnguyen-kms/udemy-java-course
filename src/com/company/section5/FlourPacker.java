package com.company.section5;

public class FlourPacker {
    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if(bigCount < 0 || smallCount < 0 || goal < 0) return false;
        int sum = bigCount * 5 + smallCount > goal ? bigCount * 5 : bigCount * 5 + smallCount;
        return goal >= sum;
    }
}
