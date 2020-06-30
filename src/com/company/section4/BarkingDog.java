package com.company.section4;

public class BarkingDog {
    public static boolean shouldWakeUp(boolean isBarking, int hourOfDay) {
        if(!isBarking) return false;
        else {
            if(hourOfDay < 0 || hourOfDay > 23) return false;
            else if(hourOfDay < 8 || hourOfDay > 22) return true;
        }
        return false;
    }
}
