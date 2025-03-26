package week4_assignment5;

import java.util.Scanner;

public class IPAddressValidator {
    public static boolean isValidIP(String ip) {
        String regex = "^((25[0-5]|2[0-4][0-9]|1?[0-9][0-9]?)\\.){3}(25[0-5]|2[0-4][0-9]|1?[0-9][0-9]?)$";
        return ip.matches(regex);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter IP Address: ");
        String ip = sc.next();
        System.out.println(isValidIP(ip) ? "Valid IP" : "Invalid IP");
        sc.close();
    }
}
