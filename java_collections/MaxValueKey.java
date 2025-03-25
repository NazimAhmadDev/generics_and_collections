package week4_assignment2;

import java.util.*;

public class MaxValueKey {
    public static void main(String[] args) {
        Map<String, Integer> inputMap = Map.of("A", 10, "B", 20, "C", 15);
        System.out.println("Key with Max Value: " + getKeyWithMaxValue(inputMap));
    }

    public static String getKeyWithMaxValue(Map<String, Integer> map) {
        return Collections.max(map.entrySet(), Map.Entry.comparingByValue()).getKey();
    }
}

