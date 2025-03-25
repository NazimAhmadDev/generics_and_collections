package week4_assignment4;

import java.util.Scanner;

public class ArrayOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer[] arr = {10, 20, 30, 40, 50}; // Sample array (Can be null for testing)

        try {
            System.out.print("Enter index: ");
            int index = sc.nextInt();

            // Simulate a null array for testing (Uncomment the next line)
            // arr = null;

            System.out.println("Value at index " + index + ": " + arr[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index!");
        } catch (NullPointerException e) {
            System.out.println("Array is not initialized!");
        } catch (Exception e) {
            System.out.println("Invalid input! Please enter an integer.");
        } finally {
            sc.close(); // Close Scanner
        }
    }
}

