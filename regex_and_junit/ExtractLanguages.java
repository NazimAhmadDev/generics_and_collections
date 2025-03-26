package week4_assignment5;

import java.util.regex.*;
import java.util.Scanner;

public class ExtractLanguages {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter text: ");
        String text = sc.nextLine();

        Pattern pattern = Pattern.compile("\\b(Java|Python|JavaScript|Go|C|C\\+\\+|Ruby)\\b");
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            System.out.print(matcher.group() + " ");
        }
        sc.close();
    }
}
