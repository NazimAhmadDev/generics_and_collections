package week4_assignment2;

import java.util.*;

public class FrequencyCounter {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "apple", "orange");
        System.out.println(findFrequency(words));
    }

    public static Map<String, Integer> findFrequency(List<String> list) {
        Map<String, Integer> frequencyMap = new HashMap<>();
        for (String word : list) {
            frequencyMap.put(word, frequencyMap.getOrDefault(word, 0) + 1);
        }
        return frequencyMap;
    }
}

