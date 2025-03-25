package week4_assignment2;

import java.util.*;

public class VotingSystem {
    private Map<String, Integer> voteCount;  // Stores candidate votes
    private Map<String, Integer> voteOrder;  // Maintains voting order

    public VotingSystem() {
        voteCount = new HashMap<>();
        voteOrder = new LinkedHashMap<>();
    }

    public void castVote(String candidate) {
        voteCount.put(candidate, voteCount.getOrDefault(candidate, 0) + 1);
        voteOrder.put(candidate, voteCount.get(candidate));
    }

    public void displayVotes() {
        System.out.println("\nVotes in insertion order:");
        for (Map.Entry<String, Integer> entry : voteOrder.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }

    public void displayResultsSorted() {
        Map<String, Integer> sortedResults = new TreeMap<>(voteCount);
        System.out.println("\nResults in alphabetical order:");
        for (Map.Entry<String, Integer> entry : sortedResults.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }

    public void displayResultsByVotes() {
        List<Map.Entry<String, Integer>> sortedList = new ArrayList<>(voteCount.entrySet());
        sortedList.sort((a, b) -> b.getValue().compareTo(a.getValue()));

        System.out.println("\nResults sorted by votes:");
        for (Map.Entry<String, Integer> entry : sortedList) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        VotingSystem votingSystem = new VotingSystem();

        votingSystem.castVote("Alice");
        votingSystem.castVote("Bob");
        votingSystem.castVote("Alice");
        votingSystem.castVote("Charlie");
        votingSystem.castVote("Bob");
        votingSystem.castVote("Alice");

        votingSystem.displayVotes();
        votingSystem.displayResultsSorted();
        votingSystem.displayResultsByVotes();
    }
}

