package week4_assignment5;

import java.util.Scanner;

public class SSNValidator {
    public static boolean isValidSSN(String ssn) {
        return ssn.matches("^\\d{3}-\\d{2}-\\d{4}$");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter SSN: ");
        String ssn = sc.next();
        System.out.println(isValidSSN(ssn) ? "Valid SSN" : "Invalid SSN");
        sc.close();
    }
}
