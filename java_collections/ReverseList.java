package week4_assignment2;

import java.util.*;

public class ReverseList {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        List<Integer> linkedList = new LinkedList<>(arrayList);

        System.out.println("Reversed ArrayList: " + reverseList(arrayList));
        System.out.println("Reversed LinkedList: " + reverseList(linkedList));
    }

    public static List<Integer> reverseList(List<Integer> list) {
        int left = 0, right = list.size() - 1;
        while (left < right) {
            int temp = list.get(left);
            list.set(left, list.get(right));
            list.set(right, temp);
            left++;
            right--;
        }
        return list;
    }
}
