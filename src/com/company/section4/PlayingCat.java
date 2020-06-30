package com.company.section4;

public class PlayingCat {
    public static boolean isCatPlaying(boolean summer, int temperature) {
        int lowestTemp = 25;
        int highestTemp = summer ? 45 : 35;
        return temperature >= lowestTemp && temperature <= highestTemp;
    }
}
