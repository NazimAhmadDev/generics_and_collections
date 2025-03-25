package week4_assignment2;

import java.util.*;

public class RemoveDuplicates {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(3, 1, 2, 2, 3, 4);
        System.out.println(removeDuplicates(list));
    }

    public static List<Integer> removeDuplicates(List<Integer> list) {
        Set<Integer> seen = new HashSet<>();
        List<Integer> result = new ArrayList<>();
        for (Integer num : list) {
            if (seen.add(num)) {
                result.add(num);
            }
        }
        return result;
    }
}

