package week4_assignment4;

public class ExceptionPropagation {
    static void method1() {
        int result = 10 / 0; // This will throw ArithmeticException
    }

    static void method2() {
        method1(); // Calls method1(), but does not handle exception
    }

    public static void main(String[] args) {
        try {
            method2(); // Calls method2(), which leads to method1()
        } catch (ArithmeticException e) {
            System.out.println("Handled exception in main");
        }
    }
}

