package com.company.section16;


import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.IntStream;

public class Challenge1 {
    public static void main() {
        Runnable runnable = () -> {
            String myString = "1 2 3";
            String[] parts = myString.split(" ");
            for(String part: parts) {
                System.out.println(part);
            }
        };

        new Thread(runnable).start();

        System.out.println(everySecondChar("123456"));


        Function<String, String> lambdaFunction = s -> {
            StringBuilder returnVal = new StringBuilder();
            for(int i = 0; i< s.length(); i++) {
                if(i%2 == 1) {
                    returnVal.append(s.charAt(i));
                }
            }
            return returnVal.toString();
        };

        System.out.println(lambdaFunction.apply("abcd"));


        Supplier<String> iLoveJava = () -> "I love java";
        System.out.println(iLoveJava.get());
    }

    public static String everySecondChar(String source) {
        char[] sourceCharArr = source.toCharArray();
        return IntStream.range(0, source.length())
                .filter(i -> i%2 == 0)
                .mapToObj(i -> sourceCharArr[i])
                .collect(Collector.of(
                        StringBuilder::new,
                        StringBuilder::append,
                        StringBuilder::append,
                        StringBuilder::toString))
                ;
    }

    public static String executeLambda(String text, Function<String, String> lambdaFunction) {
        return lambdaFunction.apply(text);
    }
}
