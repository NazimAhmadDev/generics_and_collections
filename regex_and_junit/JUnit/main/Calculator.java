import java.util.Scanner;

public class Calculator {
    public static int add(int a, int b) {
        return a+b;
    }

    public static int sub(int a,int b) {
        return a-b;
    }

    public static int mul(int a,int b) {
        return a*b;
    }

    public static int div(int a,int b) {
        return a/b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int a = sc.nextInt();

        System.out.print("Enter a number : ");
        int b = sc.nextInt();

        System.out.println("Addition of two numbers : "+add(a,b));

        System.out.println("Subtraction of two numbers : "+sub(a,b));

        System.out.println("Multiplication of two numbers : "+mul(a,b));

        System.out.println("Division of two numbers : "+div(a,b));

    }
}
