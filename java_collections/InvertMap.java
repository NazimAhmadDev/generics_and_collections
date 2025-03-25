package week4_assignment2;

import java.util.*;

public class InvertMap {
    public static void main(String[] args) {
        Map<String, Integer> inputMap = Map.of("A", 1, "B", 2, "C", 1);
        System.out.println("Inverted Map: " + invertMap(inputMap));
    }

    public static Map<Integer, List<String>> invertMap(Map<String, Integer> map) {
        Map<Integer, List<String>> invertedMap = new HashMap<>();
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            invertedMap.computeIfAbsent(entry.getValue(), k -> new ArrayList<>()).add(entry.getKey());
        }
        return invertedMap;
    }
}

