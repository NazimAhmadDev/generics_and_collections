package week4_assignment5;

import java.util.*;

public class ValidateIPv4address {
    public static boolean validIP(String ipv4) {
        return ipv4.matches("^(25[0-5]|2[0-4][0-9]|1?[0-9][0-9]?)\\.(25[0-5]|2[0-4][0-9]|1?[0-9][0-9]?)\\.(25[0-5]|2[0-4][0-9]|1?[0-9][0-9]?)\\.(25[0-5]|2[0-4][0-9]|1?[0-9][0-9]?)$");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String ipv4 = sc.nextLine();

        if(validIP(ipv4)){
            System.out.println("Valid IP");
        }else{
            System.out.println("Invalid IP");
        }
    }
}
