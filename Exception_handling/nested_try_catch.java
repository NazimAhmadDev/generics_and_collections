package week4_assignment4;

import java.util.Scanner;

public class nested_try_catch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            int[] arr = new int[5];

            System.out.print("Enter elements in array : ");
            for(int i=0;i<arr.length;i++) {
                arr[i] = sc.nextInt();
            }

            System.out.print("Enter divisor : ");
            int divisor = sc.nextInt();

            try {
                System.out.print("Enter index : ");
                int idx = sc.nextInt();

                if(divisor == 0) {
                    throw new ArithmeticException("You cannot divide by zero");
                }

                if(idx >= arr.length){
                    throw new ArrayIndexOutOfBoundsException("Index exceeded.");
                }

                int result = arr[idx] / divisor;
                System.out.print("Result : "+result);

            } catch (ArithmeticException e) {
                System.out.println(e.getMessage());
            }


        } catch(ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}
