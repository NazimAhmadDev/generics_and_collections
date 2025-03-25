package week4_assignment2;

import java.util.*;

public class RotateList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50));
        int k = 2;
        System.out.println(rotateList(list, k));
    }

    public static List<Integer> rotateList(List<Integer> list, int k) {
        int size = list.size();
        k = k % size;
        List<Integer> rotated = new ArrayList<>();
        rotated.addAll(list.subList(k, size));
        rotated.addAll(list.subList(0, k));
        return rotated;
    }
}

