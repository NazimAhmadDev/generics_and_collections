package week4_assignment2;

import java.util.*;

public class SetEquality {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(3, 2, 1));

        System.out.println("Are sets equal? " + checkEqual(set1, set2));
    }

    public static boolean checkEqual(Set<Integer> set1, Set<Integer> set2) {
        return set1.equals(set2);
    }
}
