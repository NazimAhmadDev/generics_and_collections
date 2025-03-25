package week4_assignment2;

import java.util.*;

public class BankingSystem {
    private Map<Integer, Double> accounts;      // Stores customer accounts (AccountNumber -> Balance)
    private Queue<Integer> withdrawalQueue;    // Processes withdrawal requests

    public BankingSystem() {
        accounts = new HashMap<>();
        withdrawalQueue = new LinkedList<>();
    }

    public void createAccount(int accountNumber, double balance) {
        accounts.put(accountNumber, balance);
    }

    public void deposit(int accountNumber, double amount) {
        if (accounts.containsKey(accountNumber)) {
            accounts.put(accountNumber, accounts.get(accountNumber) + amount);
            System.out.println("Deposited $" + amount + " into account " + accountNumber);
        } else {
            System.out.println("Account not found.");
        }
    }

    public void requestWithdrawal(int accountNumber) {
        if (accounts.containsKey(accountNumber)) {
            withdrawalQueue.add(accountNumber);
            System.out.println("Withdrawal request added for account " + accountNumber);
        } else {
            System.out.println("Account not found.");
        }
    }

    public void processWithdrawals(double amount) {
        while (!withdrawalQueue.isEmpty()) {
            int accountNumber = withdrawalQueue.poll();
            if (accounts.get(accountNumber) >= amount) {
                accounts.put(accountNumber, accounts.get(accountNumber) - amount);
                System.out.println("Withdrawn $" + amount + " from account " + accountNumber);
            } else {
                System.out.println("Insufficient balance in account " + accountNumber);
            }
        }
    }

    public void displayAccountsSortedByBalance() {
        TreeMap<Double, Integer> sortedAccounts = new TreeMap<>();
        for (Map.Entry<Integer, Double> entry : accounts.entrySet()) {
            sortedAccounts.put(entry.getValue(), entry.getKey());
        }

        System.out.println("\nAccounts sorted by balance:");
        for (Map.Entry<Double, Integer> entry : sortedAccounts.entrySet()) {
            System.out.println("Account " + entry.getValue() + " -> Balance: $" + entry.getKey());
        }
    }

    public static void main(String[] args) {
        BankingSystem bank = new BankingSystem();

        bank.createAccount(101, 5000.0);
        bank.createAccount(102, 2000.0);
        bank.createAccount(103, 7000.0);
        bank.createAccount(104, 3000.0);

        bank.deposit(102, 1000.0);
        bank.requestWithdrawal(101);
        bank.requestWithdrawal(104);
        bank.processWithdrawals(1500.0);

        bank.displayAccountsSortedByBalance();
    }
}

