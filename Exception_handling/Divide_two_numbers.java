package week4_assignment4;

import java.util.*;

public class Divide_two_numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter numerator : ");
            int num = sc.nextInt();

            System.out.print("Enter denominator : ");
            int den = sc.nextInt();

            if(den == 0) {
                throw new ArithmeticException("You cannot divide any number by zero");
            }

            int result = num / den;
            System.out.println("Result : "+den);

        } catch (ArithmeticException e) {
            System.err.println(e.getMessage());
        } catch(InputMismatchException e) {
            System.err.println("Invalid input. Please enter only integer");
        }
        finally {
            sc.close();
        }
    }
}
