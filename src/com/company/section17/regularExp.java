package com.company.section17;

import com.company.section5.PaintJob;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regularExp {
    public static void main() {
        // case ignore
        System.out.println("".replaceAll("(?iu)[a-f3-8]", ""));
        // digit
        System.out.println("".replaceAll("\\d", ""));
        // non digit
        System.out.println("".replaceAll("\\D", ""));
        // space
        System.out.println("".replaceAll("\\s", ""));
        // non space
        System.out.println("".replaceAll("\\S", ""));
        // {3} number of occurrence
        System.out.println("1112113".replaceAll("^1{3}", "M"));

        System.out.println("-----------------------------------------------");
        // .*<h2>.*
        StringBuilder htmlText = new StringBuilder("<h1>My Heading</h1>");
        htmlText.append("<h2>Sub-heading</h2>");
        htmlText.append("<p>This is a paragraph about something.</p>");
        htmlText.append("<p>This is another paragraph about something else.</p>");
        htmlText.append("<h2>Summary</h2>");
        htmlText.append("<p>Here is the summary.</p>");

        String h2Pattern = "<h2>";
        Pattern pattern = Pattern.compile(h2Pattern);
        Matcher matcher = pattern.matcher(htmlText);
        System.out.println(matcher.matches());

        matcher.reset();
        int count = 0;
        while(matcher.find()) {
            count++;
            System.out.println("Occurrence " + count + " : " + matcher.start() + " to " + matcher.end());

        }

        String h2GroupPattern = "(<h2>.*?</h2>)";
        Pattern groupPattern = Pattern.compile(h2GroupPattern);
        Matcher groupMatcher = groupPattern.matcher(htmlText);
        System.out.println(groupMatcher.matches());
        groupMatcher.reset();

        while(groupMatcher.find()) {
            System.out.println("Occurrence: " + groupMatcher.group(1));
        }

        String h2TextGroups = "(<h2>)(.+?)(</h2>)";
        Pattern h2TextPatten = Pattern.compile(h2TextGroups);
        Matcher h2TextMatcher = h2TextPatten.matcher(htmlText);

        while(h2TextMatcher.find()) {
            System.out.println("Occurrence: " + h2TextMatcher.group(2));
        }


        System.out.println("-----------------------------------------------");
        System.out.println("harry".replaceAll("[Hh]arry", "X"));
        System.out.println("Harry".replaceAll("[H|h]arry", "X"));

        String tvTest = "tstvtkt";
        String tNotVRegExp = "t[^v]";
        Pattern tNotPattern = Pattern.compile(tNotVRegExp);
        Matcher tNotMatcher = tNotPattern.matcher(tvTest);

        count = 0;
        while(tNotMatcher.find()) {
            count++;
            System.out.println("Occurrence " + count + " : " + tNotMatcher.start() + " to " + tNotMatcher.end());
        }
    }
}
