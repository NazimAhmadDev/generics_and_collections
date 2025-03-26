package week4_assignment5;

import java.util.*;

public class ValidateUsername {
    public static boolean isValid(String username){
        return username.matches("^[a-zA-Z][a-zA-Z0-9_]{4,14}$");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter username : ");
        String username = sc.next();

        if(isValid(username)){
            System.out.println("Valid username");
        }else{
            System.out.println("Invalid username");
        }
    }
}
