package com.company.section16;

import java.util.Arrays;
import java.util.List;

public class Challange2 {
    public static void main() {
        List<String> topName2020 = Arrays.asList("zc", "Ab");
        System.out.println(topName2020
                .stream()
                .map(name -> name.substring(0,1).toUpperCase() + name.substring(1).toLowerCase())
                .peek(System.out::println)
                .count());
    }
}
