package com.company.section17;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Challenge {
    public static void main() {
        String challenge1 = "I want a bike.";
        String challenge2 = "I want a ball.";

        String challenge2Exp = "I want a \\w+.";
        String challenge21Exp = "I want a (bike|ball).";
        System.out.println(challenge1.matches(challenge2Exp));
        System.out.println(challenge1.matches(challenge21Exp));

        Pattern patten = Pattern.compile(challenge21Exp);
        System.out.println(patten.matcher(challenge1).matches());
        System.out.println(patten.matcher(challenge2).matches());

        System.out.println("Replace all blanks with underscores.".replaceAll(" ", "_"));
        System.out.println("abcd.135".matches("[a-z]+.\\d+"));

        int count = 0;
        Pattern patten8 = Pattern.compile("[A-Za-z]+\\.(\\d+)\\s+");
        Matcher matcher8 = patten8.matcher("abcd.135\tuvqz.7\ttzik.999\n");
        while(matcher8.find()) {
            count++;
            System.out.println("Occurrence " + count + " : " + matcher8.group(1));
        }


        Pattern patten9 = Pattern.compile("\\{(.+?)}");
        Matcher matcher9= patten9.matcher("{0, 2}, {0, 5}, {1, 3}");
        while(matcher9.find()) {
            System.out.println("Occurrence "  + matcher9.group(1));
        }

        System.out.println("55555-4444".matches("^\\d{5}(-\\d{4})?$"));
        System.out.println("55555".matches("^\\d{5}(-\\d{4})?$"));
    }
}
