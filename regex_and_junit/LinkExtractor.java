package week4_assignment5;

import java.util.regex.*;
import java.util.Scanner;

public class LinkExtractor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter text: ");
        String text = sc.nextLine();

        extractLinks(text);

        sc.close();
    }

    public static void extractLinks(String text) {
        String regex = "(https?://[\\w.-]+(?:\\.[a-zA-Z]{2,})+\\S*)";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        boolean found = false;
        while (matcher.find()) {
            System.out.print(matcher.group() + " ");
            found = true;
        }

        if (!found) {
            System.out.println("No links found.");
        }
    }
}

