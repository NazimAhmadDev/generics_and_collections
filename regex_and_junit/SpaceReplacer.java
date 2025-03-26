package week4_assignment5;

import java.util.Scanner;

public class SpaceReplacer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter text: ");
        String text = sc.nextLine();

        String result = text.replaceAll("\\s+", " ");

        System.out.println("Modified Text: " + result);

        sc.close();
    }
}
