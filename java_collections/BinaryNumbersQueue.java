package week4_assignment2;

import java.util.*;

public class BinaryNumbersQueue {
    public static void main(String[] args) {
        int N = 5;
        System.out.println("Binary Numbers: " + generateBinaryNumbers(N));
    }

    public static List<String> generateBinaryNumbers(int n) {
        List<String> result = new ArrayList<>();
        Queue<String> queue = new LinkedList<>();
        queue.add("1");

        for (int i = 0; i < n; i++) {
            String current = queue.remove();
            result.add(current);
            queue.add(current + "0");
            queue.add(current + "1");
        }
        return result;
    }
}

