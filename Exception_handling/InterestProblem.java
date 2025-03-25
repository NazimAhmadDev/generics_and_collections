package week4_assignment4;

import java.util.Scanner;

public class InterestProblem {

    public static double calculateInterest(double amount, double rate, int years) {
        if(amount < 0 || rate < 0) {
            throw new IllegalArgumentException("Invalid input: Amount and rate must be positive");
        }

        double interest = (amount * rate * years) / 100;

        return interest;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter your amount : ");
            double amount = sc.nextDouble();

            System.out.print( "Enter rate : ");
            double rate = sc.nextDouble();

            System.out.print("Enter years : ");
            int years = sc.nextInt();

            System.out.println("Interest : "+calculateInterest(amount,rate,years));

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
