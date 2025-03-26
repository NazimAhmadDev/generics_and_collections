package week4_assignment5;

import java.util.*;

public class HexColorValidator {
    public static boolean isValidHexColor(String color) {
        return color.matches("^#[0-9A-Fa-f]{6}$");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a hex color code: ");
        String color = sc.next();

        if (isValidHexColor(color)) {
            System.out.println("Valid Hex Color");
        } else {
            System.out.println("Invalid Hex Color");
        }

        sc.close();
    }
}

