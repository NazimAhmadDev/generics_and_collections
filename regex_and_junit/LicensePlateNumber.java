package week4_assignment5;

import java.util.*;

public class LicensePlateNumber {
    public static boolean validLicensePlateNumber(String licensePlateNumber){
        return licensePlateNumber.matches("^[A-Z]{2}\\d{2}[A-Z]{1,2}\\d{4}$");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your license plate number : ");
        String licensePlateNumber = sc.nextLine();

        if(validLicensePlateNumber(licensePlateNumber)){
            System.out.println("Valid license plate number");
        }else{
            System.out.println("Invalid license plate number");
        }

        sc.close();

    }
}
