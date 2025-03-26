package week4_assignment5;

import java.util.regex.*;
import java.util.Scanner;

public class RepeatingWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter text: ");
        String text = sc.nextLine();

        Pattern pattern = Pattern.compile("\\b(\\w+)\\s+\\1\\b", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            System.out.print(matcher.group(1) + " ");
        }
        sc.close();
    }
}
