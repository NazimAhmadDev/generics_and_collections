package week4_assignment4;

import java.util.*;

class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class AgeValidation {
    public static void validateAge(int age) throws Exception {
        if(age < 18) {
            throw new InvalidAgeException("Age must be 18 or above.");
        }
        else if(age > 100){
            throw new InvalidAgeException("Age must be less than 100.");
        }
        System.out.println("Access granted");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter your age : ");
            int age = sc.nextInt();
            validateAge(age);
        } catch(InvalidAgeException e) {
            System.out.println(e.getMessage());
        } catch(Exception e) {
            System.out.println("Invalid input! Please enter valid age.");
        }
        finally {
            sc.close();
        }
    }
}
